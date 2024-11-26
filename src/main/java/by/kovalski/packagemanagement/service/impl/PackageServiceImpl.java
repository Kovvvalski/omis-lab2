package by.kovalski.packagemanagement.service.impl;

import by.kovalski.packagemanagement.model.Package;
import by.kovalski.packagemanagement.repository.PackageRepository;
import by.kovalski.packagemanagement.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageServiceImpl implements PackageService {
    private final PackageRepository packageRepository;

    @Autowired
    public PackageServiceImpl(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    @Override
    public void savePackage(Package pkg) {

    }

    @Override
    public boolean existsByTrackingNumber(String trackingNumber) {
        return false;
    }

    @Override
    public boolean deleteByTrackingNumber(String trackingNumber) {
        return false;
    }
}
