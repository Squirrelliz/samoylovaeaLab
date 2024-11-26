package tech.reliab.course.samoylovaea.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.samoylovaea.bank.entity.Employee;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    void deleteById(int id);
}
