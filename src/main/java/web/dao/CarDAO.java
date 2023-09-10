package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDAO {
    private List<Car> carList = new ArrayList<>();

    public CarDAO()
    {
        Car car1 = new Car("BMW", "5 series", 1993);
        Car car2 = new Car("Mercedes-Benz", "W221", 2002);
        Car car3 = new Car("Chevrolet", "Lacetti", 2007);
        Car car4 = new Car("BMW", "5X", 2005);
        Car car5 = new Car("Mercedes-Benz", "G 63 AMG", 2012);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    public List<Car> getCarList() {
        return carList;
    }

}
