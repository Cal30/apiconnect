package com.byteflair.test.apiconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by calata on 13/07/16.
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "employee")
public class Employee {

    @Id
    private String id;
    private String name;
    private String lastName;
    private EmployeeRole role;
    private Float salary;
}
