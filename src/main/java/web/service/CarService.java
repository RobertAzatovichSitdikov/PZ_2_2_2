package web.service;

import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCars(String count);
}
