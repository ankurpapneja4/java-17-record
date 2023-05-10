package dev.java.record.constructor;

import dev.java.record.utils.Preconditions;

import static dev.java.record.utils.Preconditions.ShouldNotBeNull;

public class CanonicalConstructorDemo {

    static record Customer(String id, String name){

        //Canonical Constructor can be defined if we need to perform some validation, or any other task;
        Customer(String id, String name) {

            ShouldNotBeNull(id);
            ShouldNotBeNull(name);

            this.id = id;
            this.name = name;

        }
    }

    public static void main(String[] args) {

        System.out.println(new Customer("CUSTOMER1", "Mery"));
        System.out.println(new Customer("CUSTOMER2", null));

    }


}
