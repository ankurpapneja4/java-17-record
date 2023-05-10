package dev.java.record.interfaceimplementation;

public class InterfaceImplementationDemo {

    static interface Shape {
        double area();
    }

    //Records - can implement interface
    static record Rectangle(double length,double breath) implements Shape{

        @Override
        public double area() {
            return length * breath;
        }
    }

    public static void main(String[] args) {
        System.out.println(
                new Rectangle(2,4)
                        .area());
    }

}
