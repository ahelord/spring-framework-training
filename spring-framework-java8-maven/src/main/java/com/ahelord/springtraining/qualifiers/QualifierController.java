package com.ahelord.springtraining.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/qualifier")
public class QualifierController {
    private static final Logger log = LoggerFactory.getLogger(QualifierController.class);

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Airplane airplane;
        @GetMapping
        public ResponseEntity<String> getHello(){
            airplane.fly();

            // me muestra este error cuando intento utilizar la abstracta Field animal in com.ahelord.springtraining.qualifiers.QualifierController required a single bean, but 2 were found: bird dog
            //animal.getName();


            return new ResponseEntity<>(animal.getName(), HttpStatus.OK);
        }


}
