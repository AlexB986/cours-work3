package ru.skypro.lessons.springboot.coursvork4.service;

import lombok.Getter;


public enum Status {

    STARTED("STARTED"),
    STOPPED("STOPPED"),
    CREATED("CREATED");

    private String typeStatus;

    Status(String status) {
        this.typeStatus = status;
    }

    public String getTypeStatus() {
        return typeStatus;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + typeStatus + '\'' +
                '}';
    }
}
