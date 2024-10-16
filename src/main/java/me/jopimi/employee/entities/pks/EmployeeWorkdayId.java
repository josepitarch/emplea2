package me.jopimi.employee.entities.pks;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Data
public class EmployeeWorkdayId implements Serializable {

  @Serial
  private static final long serialVersionUID = -7670984667689245136L;
  @Column(name = "managed_group_id", nullable = false, length = 2)
  private String managedGroupId;

  @Column(name = "employee_id", nullable = false, length = 7)
  private String employeeId;

  @Column(name = "start_date", nullable = false)
  private LocalDate startDate;
}
