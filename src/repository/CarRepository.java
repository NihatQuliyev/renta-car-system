package repository;

import model.Car;

import java.util.List;

public interface CarRepository {
    boolean addCar(Car car);

    List<Car> showCar();



}
