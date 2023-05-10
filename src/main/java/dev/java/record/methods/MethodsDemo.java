package dev.java.record.methods;

import dev.java.record.utils.Preconditions;

public class MethodsDemo {

    public static record Voter(Integer id, String name, Integer age){

        public Voter {
            Preconditions.ShouldNotBeNull(id);
            Preconditions.ShouldNotBeNull(age);
        }


        //New Methods can be declared inside - Record
        public boolean eligible(){
            return age.intValue() >= 18;
        }


    }

    public static void main(String[] args) {
        System.out.println(
                new Voter(1,"FooBar",20)
                        .eligible());
    }
}
