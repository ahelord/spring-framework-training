package com.ahelord.springtraining.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autowired")
public class AutowiredController {
  @Autowired
  private AreaCalculatorService areaCalculatorService;
  @GetMapping("/areas")
  public ResponseEntity<Double> getAreas(){
      return new ResponseEntity<>(areaCalculatorService.calAreas(), HttpStatus.OK);
  }

}
