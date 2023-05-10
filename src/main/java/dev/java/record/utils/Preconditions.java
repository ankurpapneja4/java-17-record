package dev.java.record.utils;

public final class Preconditions {

    public static <T> void ShouldNotBeNull(T argument){
        if(argument == null)
            throw new IllegalArgumentException();
    }

}
