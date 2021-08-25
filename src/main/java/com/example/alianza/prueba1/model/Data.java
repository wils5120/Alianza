package com.example.alianza.prueba1.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Data {
    private String Key;
    private String bussines;
    private String email;
    private Long phone;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate  date;

    public String getKey() {
        return Key;
    }
    public void setKey(String key) {
        Key = key;
    }
    public String getBussines() {
        return bussines;
    }
    public void setBussines(String bussines) {
        this.bussines = bussines;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getPhone() {
        return phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Data [Key=" + Key + ", bussines=" + bussines + ", email=" + email + ", phone="
                + phone + "]";
    }

}
