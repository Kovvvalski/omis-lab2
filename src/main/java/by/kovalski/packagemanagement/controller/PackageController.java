package by.kovalski.packagemanagement.controller;

import by.kovalski.packagemanagement.model.Package;
import by.kovalski.packagemanagement.model.PackageLocation;
import by.kovalski.packagemanagement.model.PackageStatus;
import by.kovalski.packagemanagement.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class PackageController {

    private final Random random = new Random();

    @GetMapping("/packages/get_random/{status}")
    public List<Package> getPackages(@PathVariable PackageStatus status) {
        int numberOfPackages = random.nextInt(21);
        List<Package> packages = new ArrayList<>();

        for (int i = 0; i < numberOfPackages; i++) {
            packages.add(generateRandomPackage(status));
        }

        return packages;
    }

    private Package generateRandomPackage(PackageStatus status) {
        Package pkg = new Package();
        pkg.setId(random.nextLong(1, 1_000_000));
        pkg.setName("PACKAGE " + random.nextInt(1, 1000));
        pkg.setTrackingNumber(generateRandomTrackingNumber());
        pkg.setStatus(status);
        pkg.setSender(generateRandomUser());
        pkg.setPrice(random.nextDouble(1, 1000));
        pkg.setReceiver(generateRandomUser());
        pkg.setWeight(random.nextDouble(0.5, 50.0));
        pkg.setSize(generateRandomSize());
        pkg.setCreationDate(generateRandomDate());
        pkg.setCurrentLocation(generateRandomLocation());
        return pkg;
    }

    private String generateRandomTrackingNumber() {
        return "TRK-" + random.nextInt(1_000_000, 10_000_000);
    }

    private User generateRandomUser() {
        User user = new User();
        user.setId(random.nextLong(1, 1_000_000));
        user.setName("User" + random.nextInt(1, 1000));
        user.setEmail("user" + random.nextInt(1, 1000) + "@example.com");
        user.setPassword("password" + random.nextInt(1, 1000));
        return user;
    }

    private String generateRandomSize() {
        String[] sizes = {"Small", "Medium", "Large", "Extra Large"};
        return sizes[random.nextInt(sizes.length)];
    }

    private LocalDate generateRandomDate() {
        LocalDate startDate = LocalDate.now().minusDays(30);
        long randomDays = ThreadLocalRandom.current().nextLong(0, 30);
        return startDate.plusDays(randomDays);
    }

    private PackageLocation generateRandomLocation() {
        PackageLocation location = new PackageLocation();
        location.setId(random.nextLong(1, 1_000_000));
        location.setAddress("Street " + random.nextInt(1, 100));
        location.setCity(generateRandomCity());
        location.setPostalCode(String.format("%05d", random.nextInt(100_000)));
        return location;
    }

    private String generateRandomCity() {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Miami", "Dallas"};
        return cities[random.nextInt(cities.length)];
    }
}