package by.kovalski.packagemanagement.service;

import by.kovalski.packagemanagement.model.Notification;
import by.kovalski.packagemanagement.model.Package;

import java.util.List;

public interface NotificationService {
    void sendNotification(Notification notification);

    List<Notification> getNotificationsByUserId(long userId);

    void trackPackageUpdates(Package pck);
}
