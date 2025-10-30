package com.rlatjddms.api.hair.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String gender;
    private LocalDate birthday;
    private LocalDate reservationDate;
    private LocalTime reservationTime;
    private LocalDateTime createdAt;

    public User() {
    }

    public User(int id, String firstname, String lastname, String email, String gender, LocalDate birthday, LocalDate reservationDate, LocalTime reservationTime, LocalDateTime createdAt) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", reservationDate=" + reservationDate +
                ", reservationTime=" + reservationTime +
                ", createdAt=" + createdAt +
                '}';
    }
}
