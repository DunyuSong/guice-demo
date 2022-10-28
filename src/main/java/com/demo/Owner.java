package main.java.com.demo;

import javax.inject.Inject;

public class Owner {
    private final Car car;

    @Inject
    Owner(Car car) {
        this.car = car;
    }
    public Car getCar(){
        return car;
    }
}
