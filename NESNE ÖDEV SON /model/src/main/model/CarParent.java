package main.model;

import java.util.Date;

public class CarParent {

    public  int carId;
    public String name;

    public Date dateOfRent;


    public CarParent (int carId, String name){
        this.carId = carId;
        this.name = name;
    }


    private Date getDateOfRent() {

        return new Date();
//        return dateOfRent;
    }
}
