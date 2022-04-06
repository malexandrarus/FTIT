package com.ftit.thirdassignment.animalrescuer;

public class AnimalFood {

    private String name;
    private Double price;
    private Integer quantity;
    private Integer stockAvailability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(Integer stockAvailability) {
        this.stockAvailability = stockAvailability;
    }
}
