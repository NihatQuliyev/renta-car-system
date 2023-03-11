package service.impl;
import model.Car;
import repository.CarRepository;
import repository.impl.CarRepositoryImpl;
import service.CarService;
import service.CustomerService;
import static util.InputUtil.inputInteger;
import java.util.List;
import static helper.ServiceHelper.fillAddCar;
public class CarServiceImpl implements CarService {
    public final CarRepository carRepository;
    public CarServiceImpl() {
        carRepository = new CarRepositoryImpl();
    }
    @Override
    public void addCar() {
        carRepository.addCar(fillAddCar());
    }

    @Override
    public void showCar() {
        List<Car> car = carRepository.showCar();
        car.stream().forEach(System.out::println);
        int option = inputInteger("Enter the option: ");
        for (Car cars : car) {
            if (cars.getId() == option){
                CustomerService customerService =  new CustomerServiceImpl();
                customerService.addCustomer(option);
            }
        }
    }
}
