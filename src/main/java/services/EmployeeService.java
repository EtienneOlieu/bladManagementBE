package services;

import models.Employee;
import repositories.EmployeeRepository;

import java.util.Optional;
import java.util.Set;

public class EmployeeService implements IEmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Set<Employee> findAll() {
        return null;
    }

    @Override
    public Employee save(Employee object) {
        return null;
    }

    @Override
    public void delete(Employee object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Employee> findById(Long aLong) {
        return Optional.empty();
    }
}
