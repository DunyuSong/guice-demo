package main.java.com.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceExample {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new CarModule());
        Owner owner = injector.getInstance(Owner.class);
        System.out.println(owner.getCar().drive());
    }
}
