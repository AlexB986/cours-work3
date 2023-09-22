package ru.skypro.lessons.springboot.coursvork4.dto;

public class CreateLot {

    private String title;
    private String description;
    private Integer startPrice;
    private Integer bidPrice;

    public CreateLot(String title, String description, Integer startPrice, Integer bidPrice) {
        this.title = title;
        this.description = description;
        this.startPrice = startPrice;
        this.bidPrice = bidPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(Integer startPrice) {
        this.startPrice = startPrice;
    }

    public Integer getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Integer bidPrice) {
        this.bidPrice = bidPrice;
    }

    @Override
    public String toString() {
        return "CreateLot{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startPrice=" + startPrice +
                ", bidPrice=" + bidPrice +
                '}';
    }
}
