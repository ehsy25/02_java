package com.chaewookim.api.hair;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HairDTO {
    // id,first_name,last_name,email,gender,birthday,reservation_date,reservation_time,created_at
    //1

    int id;
    String first_name;
    String last_name;
    String email;
    char gender;
    LocalDate birthday;
    LocalDate reservation_date;
    LocalTime reservation_time;
    LocalDateTime created_at;

    public HairDTO() {}

    public HairDTO[] input(String s) {
        int id;
        String first_name;
        String last_name;
        String email;
        char gender;
        LocalDate birthday;
        LocalDate reservation_date;
        LocalTime reservation_time;
        LocalDateTime created_at;

        String[] tempSlice = s.split("\n");
        int index = 9;
        HairDTO[] hairDTOS = new HairDTO[tempSlice.length];

        for (int i = 0; i < tempSlice.length; i++) {

            String[] slice = tempSlice[i].split(",");

            id = Integer.parseInt(slice[0]);
            first_name = slice[1];
            last_name = slice[2];
            email = slice[3];
            gender = slice[4].charAt(0);
            if (slice[5].isEmpty()) {
                birthday = null;
            } else {
                birthday = LocalDate.parse(slice[5], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            }
            reservation_date = LocalDate.parse(slice[6], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            reservation_time = LocalTime.parse(slice[7], DateTimeFormatter.ofPattern("H:mm"));
            created_at = LocalDateTime.parse(slice[8], DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));

            hairDTOS[i] = new HairDTO(id, first_name, last_name, email, gender, birthday, reservation_date, reservation_time, created_at);
        }

        return hairDTOS;
    }

    public HairDTO(int id, String first_name, String last_name, String email, char gender, LocalDate birthday, LocalDate reservation_date, LocalTime reservation_time, LocalDateTime created_at) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.reservation_date = reservation_date;
        this.reservation_time = reservation_time;
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "HairDTO{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", reservation_date=" + reservation_date +
                ", reservation_time=" + reservation_time +
                ", created_at=" + created_at +
                '}';
    }
}
