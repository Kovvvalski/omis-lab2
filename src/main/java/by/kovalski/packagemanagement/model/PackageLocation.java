package by.kovalski.packagemanagement.model;

import lombok.Data;

@Data
public class PackageLocation {
    private long id;
    private String address;
    private String city;
    private String postalCode;
}
