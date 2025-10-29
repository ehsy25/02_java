package com.ohgiraffers.api.hair.model.dto;

public class User {
    private String id;
    private String firstNmae;
    private String lastName;
    private String email;
    private String gender;
    private String birthday;
    private String reservationDate;
    private String reservationTime;
    private String createAt;

    public User(String id, String firstNmae, String lastName, String email, String gender, String birthday, String reservationDate, String reservationTime, String createAt) {
        this.id = id;
        this.firstNmae = firstNmae;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstNmae='" + firstNmae + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", reservationDate='" + reservationDate + '\'' +
                ", reservationTime='" + reservationTime + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }
}
