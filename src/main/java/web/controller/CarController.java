package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) String count
            , Model model) {
        List<Car> cars = new ArrayList<>();
        List <Car> carList = new CarDAO().getCarList();

        if (count == null || Integer.parseInt(count) > 5) {
            count = "5";
        }

        for (int i = 0; i <= (Integer.parseInt(count) - 1); i++ ) {
            cars.add(carList.get(i));
        }

        model.addAttribute("cars", cars);

        return "cars";
    }
}
