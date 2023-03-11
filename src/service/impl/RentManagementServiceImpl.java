package service.impl;
import exception.InvalidOptionException;
import service.CarService;
import service.CustomerService;
import service.RentManagementService;
import static util.MenuUtil.entry;
public class RentManagementServiceImpl implements RentManagementService {
    @Override
    public void management() {
        CarService carService = new CarServiceImpl();
        CustomerService customerService = new CustomerServiceImpl();
        while (true) {
            try {
                int option = entry();
                switch (option) {
                    case 0 -> System.exit(-1);
                    case 1 -> carService.showCar();
                    case 2 -> customerService.showCustomer();
                    case 3 -> carService.addCar();
                    default -> throw new InvalidOptionException();
                }
            } catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}