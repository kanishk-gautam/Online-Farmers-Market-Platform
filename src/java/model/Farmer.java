package models;

public class Farmer {
    private String name;
    private String produce;
    private double pricePerKg;

    // Constructor
    public Farmer(String name, String produce, double pricePerKg) {
        this.name = name;
        this.produce = produce;
        this.pricePerKg = pricePerKg;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    // Override toString for display purposes
    @Override
    public String toString() {
        return "Farmer{name='" + name + '\'' +
               ", produce='" + produce + '\'' +
               ", pricePerKg=" + pricePerKg + '}';
    }
}
