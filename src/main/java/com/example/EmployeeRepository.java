package com.example;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Query("select new com.example.EmployeeDTO (e.id, e.name, e.department.code) from Employee e ")
    List<EmployeeDTO> getEmployees();
}
