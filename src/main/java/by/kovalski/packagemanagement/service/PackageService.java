package by.kovalski.packagemanagement.service;

import by.kovalski.packagemanagement.model.Package;

public interface PackageService {
    void savePackage(Package pkg);

    boolean existsByTrackingNumber(String trackingNumber);

    boolean deleteByTrackingNumber(String trackingNumber);
}
