package me.jopimi.employee.entities.pks;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Data
public class EmployeeId implements Serializable {

  @Serial
  private static final long serialVersionUID = 5911390543699254563L;

  @Column(name = "managed_group_id", nullable = false, length = 2)
  private String managedGroupId;

  @Column(name = "employee_id", nullable = false, length = 7)
  private String employeeId;

}
