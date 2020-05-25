package com.company;

public class VipCustomer {
    public String getName() {
        return this.name;
    }

    public double getLimit() {
        return this.limit;
    }

    public String getEmail() {
        return this.email;
    }

    private String name;
    private double limit;
    private String email;

    public VipCustomer() {
        this("Default name", 1000.00, "defaultemail@gmail.com");
    }

    public VipCustomer(String name, double limit) {
        this(name, limit, "angelulais18@gmail.com");
    }

    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }
}
