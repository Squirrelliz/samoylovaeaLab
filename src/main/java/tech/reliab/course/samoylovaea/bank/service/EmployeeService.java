package tech.reliab.course.samoylovaea.bank.service;

import tech.reliab.course.samoylovaea.bank.entity.Employee;
import tech.reliab.course.samoylovaea.bank.model.EmployeeRequest;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(EmployeeRequest employeeRequest);

    Employee getEmployeeDtoById(int id);

    Employee getEmployeeById(int id);

    List<Employee> getAllEmployees();

    Employee updateEmployee(int id, String name);

    void deleteEmployee(int id);
}
