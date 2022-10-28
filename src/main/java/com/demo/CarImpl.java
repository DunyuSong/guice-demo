package main.java.com.demo;


import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CarImpl implements Car {

    @Inject
    CarImpl(){

    }

    @Override
    public int drive() {
        return 60;
    }

    public static CarImpl create(){
        return new CarImpl();
    }
}
