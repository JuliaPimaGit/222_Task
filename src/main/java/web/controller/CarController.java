package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String allCars(Model model, @RequestParam (value = "count", defaultValue = "5") int number) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tesla", 2020,"Alex P"));
        carList.add(new Car("Lexus", 2012,"Tom H"));
        carList.add(new Car("Audi", 2020,"Jane B"));
        carList.add(new Car("BMW", 2001,"Bob S"));
        carList.add(new Car("Acura", 2019,"Kate A"));
        List <Car> list = CarService.countCar(carList,number);
        model.addAttribute("list",list);
        return "cars";
    }
}
