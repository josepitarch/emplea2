package me.jopimi.employee.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import me.jopimi.employee.entities.pks.EmployeeWorkdayId;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "employee_workday")
public class EmployeeWorkday {
  @EmbeddedId
  private EmployeeWorkdayId id;

  @Column(name = "end_date")
  private LocalDate endDate;

  @Column(name = "workday_type", nullable = false, length = 3)
  private String workdayType;

  @Column(name = "hours_per_week", nullable = false)
  private Short hoursPerWeek;

}
