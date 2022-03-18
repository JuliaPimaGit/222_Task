package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final static List<Car> carList = new ArrayList<>();

    public static List<Car> addCars() {
        carList.add(new Car("Tesla", 2020, "Alex P"));
        carList.add(new Car("Lexus", 2012, "Tom H"));
        carList.add(new Car("Audi", 2020, "Jane B"));
        carList.add(new Car("BMW", 2001, "Bob S"));
        carList.add(new Car("Acura", 2019, "Kate A"));
        return carList;
    }

    public List<Car> countCar(int index) {
        if (index > 5) {
            index = 5;
        }
        return CarServiceImp.addCars().subList(0, index);
    }
}
