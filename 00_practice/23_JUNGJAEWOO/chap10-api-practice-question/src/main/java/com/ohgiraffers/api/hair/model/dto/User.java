package com.ohgiraffers.api.hair.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {
    private int userNo;
    private String FirstName;
    private String lastName;
    private String email;
    private String gender;
    private LocalDate birth;
    private LocalDate reservationDate;
    private LocalTime resprervationTime;
    private LocalDateTime reservationEndDate;

    public User() {
    }

    public User(int userNo, String firstName, String lastName, String email, String gender, LocalDate birth,
                LocalDate reservationDate, LocalTime resprervationTime, LocalDateTime reservationEndDate) {
        this.userNo = userNo;
        FirstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
        this.reservationDate = reservationDate;
        this.resprervationTime = resprervationTime;
        this.reservationEndDate = reservationEndDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNo=" + userNo +
                ", FirstName='" + FirstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birth=" + birth +
                ", reservationDate=" + reservationDate +
                ", resprervationTime=" + resprervationTime +
                ", reservationEndDate=" + reservationEndDate +
                '}';
    }
}
