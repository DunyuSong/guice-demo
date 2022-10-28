package main.java.com.demo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class CarModule extends AbstractModule {

    @Override
    protected void configure(){

        //方式一
//        bind(Car.class).to(CarImpl.class);

        //方式二
//        bind(Car.class).toInstance(CarImpl.create());
    }
    //方式三
    @Provides
    Car providerCar(){
        return CarImpl.create();
    }
}
