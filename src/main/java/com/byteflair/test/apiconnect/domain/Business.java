package com.byteflair.test.apiconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by calata on 13/07/16.
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "business")
public class Business {

    @Id
    private String id;
    private String companyName;
    private String socialAddress;
    private List<Employee> employeeList;
}
