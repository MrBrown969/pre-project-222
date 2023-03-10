package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    CarServiceImpl carServiceImpl = new CarServiceImpl();

    @GetMapping("/cars")
    public String carsAmount(@RequestParam(required = false) Integer count, Model model){
        if (count == null) {
            count = 5;
        }
        model.addAttribute("severalCarsAttribute", carServiceImpl
                .giveSeveralCars(count));
        return "cars";
    }

}
