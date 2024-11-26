package by.kovalski.packagemanagement.repository;

import by.kovalski.packagemanagement.model.Notification;
import by.kovalski.packagemanagement.model.Package;

import java.util.List;

public interface NotificationRepository {
    void save(Notification notification);

    List<Notification> findNotificationByReceiverId(long receiverId);

    void trackPackageStatus(Package pck);

    void trackPackageLocation(Package pck);
}
