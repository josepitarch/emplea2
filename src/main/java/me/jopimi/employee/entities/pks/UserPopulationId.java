package me.jopimi.employee.entities.pks;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.util.Objects;

@Data
public class UserPopulationId implements java.io.Serializable {

  @Serial
  private static final long serialVersionUID = 3684993995532892234L;

  @Column(name = "managed_group_id", nullable = false, length = 2)
  private String managedGroupId;

  @Column(name = "employee_id", nullable = false, length = 7)
  private String employeeId;

  @Column(name = "role_id", nullable = false, length = 20)
  private String roleId;

  @Column(name = "population_id", nullable = false)
  private Integer populationId;

}
