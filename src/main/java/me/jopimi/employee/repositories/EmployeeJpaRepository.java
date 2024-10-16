package me.jopimi.employee.repositories;

import me.jopimi.employee.entities.Employee;
import me.jopimi.employee.entities.pks.EmployeeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, EmployeeId> {
}
