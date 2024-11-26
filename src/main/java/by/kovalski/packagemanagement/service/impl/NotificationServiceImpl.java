package by.kovalski.packagemanagement.service.impl;

import by.kovalski.packagemanagement.model.Notification;
import by.kovalski.packagemanagement.model.Package;
import by.kovalski.packagemanagement.repository.NotificationRepository;
import by.kovalski.packagemanagement.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {
    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public void sendNotification(Notification notification) {

    }

    @Override
    public List<Notification> getNotificationsByUserId(long userId) {
        return List.of();
    }

    @Override
    public void trackPackageUpdates(Package pck) {

    }
}
