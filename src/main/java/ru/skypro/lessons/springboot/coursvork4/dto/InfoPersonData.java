package ru.skypro.lessons.springboot.coursvork4.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@AllArgsConstructor
@NoArgsConstructor
public class InfoPersonData {

    private String bidderName;
    private Timestamp bidDate;

    public String getBidderName() {
        return bidderName;
    }

    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }

    public Timestamp getBidDate() {
        return bidDate;
    }

    public void setBidDate(Timestamp bidDate) {
        this.bidDate = bidDate;
    }

    @Override
    public String toString() {
        return "infoPersonData{" +
                "bidderName='" + bidderName + '\'' +
                ", bidDate=" + bidDate +
                '}';
    }
}
