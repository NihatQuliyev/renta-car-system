package service.impl;
import model.Customer;
import repository.CustomerRepository;
import repository.impl.CustomerRepositoryImpl;
import service.CustomerService;
import java.util.List;
import static helper.ServiceHelper.filAddCustomer;
public class CustomerServiceImpl implements CustomerService {
    public final CustomerRepository customerRepository;
    public CustomerServiceImpl() {
        customerRepository = new CustomerRepositoryImpl();
    }
    @Override
    public void addCustomer(Integer id) {
        customerRepository.addCustomer(filAddCustomer(id));
    }
    @Override
    public void showCustomer() {
        List<Customer> customer = customerRepository.showCustomer();
        customer.stream()
                .forEach(System.out::println);

    }
}
