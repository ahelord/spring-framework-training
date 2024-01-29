package com.ahelord.springtraining.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/spel")
public class SpelController {

    @GetMapping
    public ResponseEntity<Object> getSpel(){
        // Sirve para probar que la expresion funcione correctmanete
        ExpressionParser expressionParser = new
                SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("10 + 20");

        try {
            return new ResponseEntity<>(expression.getValue(), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
