package ru.skypro.lessons.springboot.coursvork4.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import ru.skypro.lessons.springboot.coursvork4.pojo.Bid;
import ru.skypro.lessons.springboot.coursvork4.service.Status;

public class FullLot {
    private Integer id;
    private String status;
    private String descriptor;
    private Integer startPrice;
    private Integer bidPrice;
    private Integer currentPrice;
    private Bid lastBid;

    public FullLot(Integer id, String status, String descriptor, Integer startPrice, Integer bidPrice, Integer currentPrice, Bid lastBid) {
        this.id = id;
        this.status = status;
        this.descriptor = descriptor;
        this.startPrice = startPrice;
        this.bidPrice = bidPrice;
        this.currentPrice = currentPrice;
        this.lastBid = lastBid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
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

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Bid getlastBid() {
        return lastBid;
    }

    public void setlastBid(Bid bid) {
        this.lastBid = lastBid;
    }

    @Override
    public String toString() {
        return "FullLot{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", descriptor='" + descriptor + '\'' +
                ", startPrice=" + startPrice +
                ", bidPrice=" + bidPrice +
                ", currentPrice=" + currentPrice +
                ", lastBid=" + lastBid +
                '}';
    }
}
