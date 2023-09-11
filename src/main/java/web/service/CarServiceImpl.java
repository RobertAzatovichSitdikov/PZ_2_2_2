package web.service;

import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(String count) {
        List<Car> cars = new ArrayList<>();
        List<Car> carList = new CarDAO().getCarList();
        if (count == null || Integer.parseInt(count) > 5) {
            count = "5";
        } else if (Integer.parseInt(count) < 0) {
            count = "5";
            carList = new ArrayList<>();
            carList.add(new Car());
            carList.add(new Car());
            carList.add(new Car());
            carList.add(new Car());
            carList.add(new Car());
        }

        for (int i = 0; i <= (Integer.parseInt(count) - 1); i++ ) {
            cars.add(carList.get(i));
        }

        return cars;
    }
}
