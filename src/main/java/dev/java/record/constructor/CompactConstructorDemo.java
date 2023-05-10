package dev.java.record.constructor;

import dev.java.record.utils.Preconditions;

import static dev.java.record.utils.Preconditions.ShouldNotBeNull;

public class CompactConstructorDemo {

    static record Customer(String id, String name){

        //Compact constructor
        Customer {
            ShouldNotBeNull(id);
            ShouldNotBeNull(name);

            // Do Not Write Below BoilerPlate Code In Compact Constructor
            // this.id = id;
            // this.name = name;
        }
    }

    public static void main(String[] args) {

        System.out.println(new Customer("CUSTOMER1","Mery"));
        System.out.println(new Customer(null, "John"));
    }
}
