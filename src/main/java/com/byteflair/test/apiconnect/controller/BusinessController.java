package com.byteflair.test.apiconnect.controller;


import com.byteflair.test.apiconnect.repository.BusinessRepository;
import com.byteflair.test.apiconnect.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by calata on 6/07/16.
 */
@RestController
@RequestMapping
public class BusinessController {

    org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(BusinessController.class);

    @Autowired
    BusinessRepository businessRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    /*@RequestMapping(value = "/contract",
            method = RequestMethod.PUT)
    public ResponseEntity<Business> contract(@PathVariable String id){

        Business business = businessRepository.findOne(id);


        return new ResponseEntity<>(business, HttpStatus.OK);
    }*/

}
