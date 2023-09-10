package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public void getCars(List<Car> carList, int count);
}
