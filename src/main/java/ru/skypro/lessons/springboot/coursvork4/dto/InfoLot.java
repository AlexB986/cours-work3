package ru.skypro.lessons.springboot.coursvork4.dto;

public class InfoLot {
    private String status;
    private String titel;
    private String description;
    private Integer startPrice;
    private Integer bidPrice;

    public InfoLot(String status, String titel, String description, Integer startPrice, Integer bidPrice) {
        this.status = status;
        this.titel = titel;
        this.description = description;
        this.startPrice = startPrice;
        this.bidPrice = bidPrice;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
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

//    @Override
//    public String toString() {
//        return "InfoLot{
//                ", status='" + status + '\'' +
//                ", titel='" + titel + '\'' +
//                ", description='" + description + '\'' +
//                ", startPrice=" + startPrice +
//                ", bidPrice=" + bidPrice +
//                '}';
//    }
}
