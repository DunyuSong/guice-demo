package main.java.com.demo;

import com.google.inject.AbstractModule;

public class CarModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(Car.class).to(CarImpl.class);
    }
}
