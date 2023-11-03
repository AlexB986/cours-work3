package ru.skypro.lessons.springboot.coursvork4.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
public class BiderInfo {

    private String bidderName;
    private LocalDateTime bidDate;

    public String getBidderName() {
        return bidderName;
    }

    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }

    public LocalDateTime getBidDate() {
        return bidDate;
    }

    public void setBidDate(LocalDateTime bidDate) {
        this.bidDate = bidDate;
    }

    @Override
    public String toString() {
        return "BiderInfo{" +
                "bidderName='" + bidderName + '\'' +
                ", bidDate=" + bidDate +
                '}';
    }
}
