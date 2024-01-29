package com.ahelord.springtraining.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaCalculatorService {

    @Autowired
    private List<Figure> figures;
    public double calAreas(){
        double area = 0;
        for(Figure figure: figures){
            area+=figure.calculateArea();
        }
        return area;
    }
}
