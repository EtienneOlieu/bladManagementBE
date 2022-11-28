package controllers;

import org.springframework.web.bind.annotation.RestController;
import services.IEmployeeService;

@RestController
public class EmployeeController {

    private IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
