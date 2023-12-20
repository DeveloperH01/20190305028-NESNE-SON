package main.model;

import java.io.Serializable;
import java.util.Date;



// inheritance example here
// interface example
public class Car extends CarParent implements Serializable, VehicleInterface{


    private String brand;
    private String numberPlate;
    private int rentPricePerDay;
    private int numberOfDays;
    private int costPrice;
    private int totalRentPrice;
    private String color;
    private Customer currentUser;

    private Date dateOfReturn;


    public Car(int carId, String name, String brand, String numberPlate, int rentPricePerDay, int costPrice, String color) {

        // inheritance example here
        super(carId, name);
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.rentPricePerDay = rentPricePerDay;
        this.costPrice = costPrice;
        this.color = color;
        numberOfDays = 0;
        totalRentPrice = 0;
    }

    // Polymorphism example
    @Override
    public Date getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(Date dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public int getTotalRentPrice() {
        return totalRentPrice;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setTotalRentPrice() {
        this.totalRentPrice = this.rentPricePerDay * this.numberOfDays;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getRentPricePerDay() {
        return rentPricePerDay;
    }

    public void setRentPricePerDay(int rentPricePerDay) {
        this.rentPricePerDay = rentPricePerDay;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Customer getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Customer currentUser) {
        this.currentUser = currentUser;
    }


    @Override
    public String toString() {
        return  "carId=" + carId +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", rentPricePerDay=" + rentPricePerDay +
                ", costPrice=" + costPrice +
                ", color='" + color + '\'';
    }
}
