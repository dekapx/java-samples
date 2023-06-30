package com.dekapx.java.optional;

import com.dekapx.java.model.Car;
import com.dekapx.java.model.Person;

import java.util.Optional;

import static com.dekapx.java.model.BodyType.SUV;
import static com.dekapx.java.model.FuelType.HYBRID;

public class OptionalDemo {
    public static void main(String[] args) {
        Person person = buildPersonModel();
        String model = getCarModel(Optional.of(person));
        System.out.println(model);
    }

    private static String getCarModel(Optional<Person> person) {
        return person.flatMap(Person::carOptional)
                .map(Car::model)
                .orElse("Not Found");
    }

    private static Person buildPersonModel() {
        Car car = new Car("BMW", "X5", SUV, HYBRID);
        return new Person("Dummy", "Person", Optional.of(car));
    }
}
