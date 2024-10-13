package com.directi.training.srp.exercise;

import java.util.List;

public class CarFormatter {
    private final CarRepository _carRepository;

    public CarFormatter(CarRepository carRepository) {
        _carRepository = carRepository;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        List<Car> cars = _carRepository.getAllCars();
        for (Car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
