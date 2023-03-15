package model;

public class Car {
    private Long id ;
    private String brand;
    private String engine;
    private String production;
    private String bodyType;
    private Integer seats;
    private Integer doors;
    private Integer speed;
    private Integer rentAmount;
    private Integer status;

    public Car(Long id, String brand, String engine, String production, String bodyType, Integer seats, Integer doors, Integer speed, Integer rentAmount, Integer status) {
        this.id = id;
        this.brand = brand;
        this.engine = engine;
        this.production = production;
        this.bodyType = bodyType;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.rentAmount = rentAmount;
        this.status = status;
    }

    public Car(String brand, String engine, String production, String bodyType, Integer seats, Integer doors, Integer speed, Integer rentAmount, Integer status) {
        this.brand = brand;
        this.engine = engine;
        this.production = production;
        this.bodyType = bodyType;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.rentAmount = rentAmount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(Integer rentAmount) {
        this.rentAmount = rentAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                ", production='" + production + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                ", speed=" + speed +
                ", rentAmount=" + rentAmount +
                '}';
    }
}
