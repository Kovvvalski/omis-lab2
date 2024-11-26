package by.kovalski.packagemanagement.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Package {
    private long id;
    private String name;
    private String trackingNumber;
    private PackageStatus status;
    private User sender;
    private User receiver;
    private double weight;
    private double price;
    private String size;
    private LocalDate creationDate;
    private PackageLocation currentLocation;
}
