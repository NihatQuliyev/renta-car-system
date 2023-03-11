package repository.impl;
import exception.NotFoundCustomerException;
import model.Customer;
import query.CustomerQuery;
import repository.CustomerRepository;
import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import static repository.DbConnection.connect;
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public boolean addCustomer(Customer customer) {
        try(Connection connection =connect()){
            PreparedStatement preparedStatement = connection.prepareStatement(CustomerQuery.ADD_CUSTOMER);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getSurname());
            preparedStatement.setDate(3, Date.valueOf(customer.getBirthday()));
            preparedStatement.setString(4,customer.getFin());
            preparedStatement.setString(5,customer.getPasswordSerial());
            preparedStatement.setInt(6,customer.getCarId());
            preparedStatement.setInt(7,customer.getStatus());
            int count = preparedStatement.executeUpdate();
            return count>0;

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Customer> showCustomer() {
        try(Connection connect = connect()) {
            PreparedStatement preparedStatement = connect.prepareStatement(CustomerQuery.SHOW_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Customer> customers = new LinkedList<>();
            if (resultSet.wasNull()) throw new NotFoundCustomerException();
            while (resultSet.next()){
                Long id  = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                LocalDate birthday = resultSet.getDate("birthday").toLocalDate();
                String fin = resultSet.getString("fin");
                String passwordSerial = resultSet.getString("passwordSerial");
                Integer carId = resultSet.getInt("car_id");
                Integer status = resultSet.getInt("status");
                customers.add(new Customer(id,name,surname,birthday,fin,passwordSerial,carId,status));
            }
            return customers;

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
