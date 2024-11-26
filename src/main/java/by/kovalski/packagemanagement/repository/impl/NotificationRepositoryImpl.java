package by.kovalski.packagemanagement.repository.impl;

import by.kovalski.packagemanagement.model.Notification;
import by.kovalski.packagemanagement.model.Package;
import by.kovalski.packagemanagement.repository.NotificationRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NotificationRepositoryImpl implements NotificationRepository {
    @Override
    public void save(Notification notification) {

    }

    @Override
    public List<Notification> findNotificationByReceiverId(long receiverId) {
        return List.of();
    }

    @Override
    public void trackPackageStatus(Package pck) {

    }

    @Override
    public void trackPackageLocation(Package pck) {

    }
}
