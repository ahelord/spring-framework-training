package com.ahelord.springtraining.scopes;

import com.ahelord.springtraining.qualifiers.QualifierController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/scopes")
public class ScopesController {
    private static final Logger log = LoggerFactory.getLogger(ScopesController.class);


    @Autowired
    private PrototypeService prototypeService;
    @Autowired
    private PrototypeService prototypeServiceTwo;

    @Autowired
    private SingletonService singletonService;

    @Autowired
    private SingletonService singletonServiceTwo;
    @GetMapping
    public ResponseEntity<String> getEnv(){


        log.info("Are beans prototype equals {}",prototypeService.equals(prototypeServiceTwo));

        log.info("Are beans prototype == {}",prototypeService==prototypeServiceTwo);

        log.info("Are beans singleton equals {}",singletonService.equals(singletonServiceTwo));

        log.info("Are beans singleton == {}",singletonService==singletonServiceTwo);


        return new ResponseEntity<>("scopes", HttpStatus.OK);
    }
}
