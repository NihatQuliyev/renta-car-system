package model;

import java.time.LocalDate;

public class Customer {
    Long id;
    String name;
    String surname;
    LocalDate birthday;
    String fin;
    String passwordSerial;
    Integer carId;
    Integer status;

    public Customer(String name, String surname, LocalDate birthday, String fin, String passwordSerial, Integer carId, Integer status) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.fin = fin;
        this.passwordSerial = passwordSerial;
        this.carId = carId;
        this.status = status;
    }

    public Customer(Long id, String name, String surname, LocalDate birthday, String fin, String passwordSerial, Integer carId, Integer status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.fin = fin;
        this.passwordSerial = passwordSerial;
        this.carId = carId;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getPasswordSerial() {
        return passwordSerial;
    }

    public void setPasswordSerial(String passwordSerial) {
        this.passwordSerial = passwordSerial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", fin='" + fin + '\'' +
                ", passwordSerial='" + passwordSerial + '\'' +
                ", carId=" + carId +
                ", status=" + status +
                '}';
    }
}
