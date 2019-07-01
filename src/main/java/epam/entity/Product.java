package epam.entity;

import java.time.LocalDate;

public class Product {
 private String manufacturer;
 private String model; //2chararcters & 3 numbers
 private LocalDate dateOfManufacture;
 private String color;
 private Integer price;
 private Integer amount;

    public Product(String manufacturer, String model, LocalDate dateOfManufacture, String color, Integer price, Integer amount) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.dateOfManufacture = dateOfManufacture;
        this.color = color;
        this.price = price;
        this.amount = amount;
    }


}
