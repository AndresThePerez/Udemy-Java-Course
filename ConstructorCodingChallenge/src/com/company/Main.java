package com.company;

public class Main {

    public static void main(String[] args) {

	    VipCustomer andres = new VipCustomer();
        System.out.println(andres.getEmail());

        VipCustomer person2 = new VipCustomer("Bob", 2500.00);
        System.out.println(person2.getEmail());

        VipCustomer person3 = new VipCustomer("Tristin", 23843.00, "t@gmail.com");
        System.out.println(person3.getEmail());

    }
}
