package controllers;

import models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.IEmployeeService;

import java.util.Set;

@RestController
public class EmployeeController {

    private IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/get/allEmployees")
    public ResponseEntity<Set<Employee>> getAll (){
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/create/employee")
    public ResponseEntity<Employee> create (@RequestBody Employee employee){
        if (employee != null){
            return new ResponseEntity<>(employeeService.save(employee), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(employeeService.save(employee), HttpStatus.BAD_REQUEST);
        }
    }
}
