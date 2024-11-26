package by.kovalski.packagemanagement.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Notification {
    private long id;
    private String title;
    private String message;
    private LocalDateTime sendTime;
    private User receiver;
}
