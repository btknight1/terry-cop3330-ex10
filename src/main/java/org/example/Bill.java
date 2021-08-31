package org.example;

public class Bill {
    private double total = 0;

    public void updateTotal(double price){
        this.total = this.total + price;
    }

    public double showTax(double tax){
        return total * (tax/100);
    }

    public double showTotal(){
        return total;
    }

    public void applyTax(double tax){
        this.total = this.total + (this.total * (tax/100));
    }
}