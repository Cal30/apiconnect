package com.byteflair.test.apiconnect.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by calata on 6/07/16.
 */
@RestController
@RequestMapping("/api")
public class PruebaRest {

    org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(PruebaRest.class);

    @RequestMapping(value = "/pruebarest")
    public String getPruebaRest(){
        String str = "Esto es un string aleatorio y genera numeros aleatoros ";
        for(int i=0; i<5; i++){
            str = str.concat(String.valueOf(new Random().nextInt(100))).concat(" ");
        }

        log.info("Return "+str+ ". Method /pruebarest GET");
        return str;
    }


    @RequestMapping(value = "/pruebarest",
            method = RequestMethod.POST)
    public ResponseEntity<String> getPruebaRest(@RequestBody String body){
        if (body == null || "".equals(body)){
            body = "";
        }
        for(int i=0; i<5; i++){
            body = body.concat(String.valueOf(new Random().nextInt(100))).concat(" ");
        }

        log.info("Return "+body+ ". Method /pruebarest POST");


        return new ResponseEntity<String>(body, HttpStatus.OK);
    }


    @RequestMapping(value = "/pruebarest",
            method = RequestMethod.DELETE)
    public HttpStatus deletePruebaRest(@RequestBody String id){


        return HttpStatus.OK;

    }

}
