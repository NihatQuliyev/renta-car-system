package repository;

import model.Customer;

import java.util.List;

public interface CustomerRepository {
    boolean addCustomer(Customer customer);
    List<Customer> showCustomer();

}
