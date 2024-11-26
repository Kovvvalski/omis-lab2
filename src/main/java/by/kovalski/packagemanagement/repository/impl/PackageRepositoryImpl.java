package by.kovalski.packagemanagement.repository.impl;

import by.kovalski.packagemanagement.model.Package;
import by.kovalski.packagemanagement.repository.PackageRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PackageRepositoryImpl implements PackageRepository {
    @Override
    public void savePackage(Package pck) {

    }

    @Override
    public boolean existsByTrackingNumber(String trackingNumber) {
        return false;
    }

    @Override
    public void deleteByTrackingNumber(String trackingNumber) {

    }
}
