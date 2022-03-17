package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    public List<Car> countCar(List<Car> cars, int index) {
        if (index>5){index=5;}
        return cars.subList(0,index);

    }
}
