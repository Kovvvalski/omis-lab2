package by.kovalski.packagemanagement.repository;

import by.kovalski.packagemanagement.model.Package;

public interface PackageRepository {
    void savePackage(Package pck);

    boolean existsByTrackingNumber(String trackingNumber);

    void deleteByTrackingNumber(String trackingNumber);
}
