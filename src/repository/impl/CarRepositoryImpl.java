package repository.impl;
import exception.NotFoundCarException;
import model.Car;
import query.CarQuery;
import repository.CarRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import static repository.DbConnection.connect;
public class CarRepositoryImpl implements CarRepository {
    @Override
    public boolean addCar(Car car) {
        try(Connection connection =connect()){
            PreparedStatement preparedStatement = connection.prepareStatement(CarQuery.ADD_CAR);
            preparedStatement.setString(1,car.getBrand());
            preparedStatement.setString(2,car.getEngine());
            preparedStatement.setString(3,car.getProduction());
            preparedStatement.setString(4,car.getBodyType());
            preparedStatement.setInt(5,car.getSeats());
            preparedStatement.setInt(6,car.getDoors());
            preparedStatement.setInt(7,car.getSpeed());
            preparedStatement.setInt(8,car.getRentAmount());
            preparedStatement.setInt(9,car.getStatus());
            int count = preparedStatement.executeUpdate();
            return count>0;
        } catch (SQLException  | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Car> showCar() {
        try(Connection connect = connect()) {
            PreparedStatement preparedStatement = connect.prepareStatement(CarQuery.SHOW_CAR);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Car> car = new LinkedList<>();
            if (resultSet.wasNull()) throw new NotFoundCarException();
            while (resultSet.next()){
                Long id  = resultSet.getLong("id");
                String brand = resultSet.getString("brand");
                String engine = resultSet.getString("engine");
                String production = resultSet.getString("production");
                String bodyType = resultSet.getString("bodyType");
                Integer seats = resultSet.getInt("seats");
                Integer doors = resultSet.getInt("doors");
                Integer speed = resultSet.getInt("speed");
                Integer rentAmount = resultSet.getInt("rent_amount");
                Integer status = resultSet.getInt("status");
                car.add(new Car(id,brand,engine,production,bodyType,seats,doors,speed,rentAmount,status));
            }
            return car;

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
