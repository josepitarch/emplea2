package me.jopimi.employee.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import me.jopimi.employee.entities.pks.EmployeeId;

import java.util.List;

@Data
@Entity
@Table(name = "employee")
public class Employee {

  @EmbeddedId
  private EmployeeId id;

  @Column(name = "name", nullable = false, length = 20)
  private String name;

  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name = "managed_group_id", referencedColumnName = "managed_group_id", insertable = false, updatable = false)
  @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", insertable = false, updatable = false)
  private List<EmployeeWorkday> workdays;

}
