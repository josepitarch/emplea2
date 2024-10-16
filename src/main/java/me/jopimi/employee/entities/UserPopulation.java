package me.jopimi.employee.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import me.jopimi.employee.entities.pks.UserPopulationId;

@Data
@Entity
@Table(name = "user_population")
public class UserPopulation {

  @EmbeddedId
  private UserPopulationId id;

  @ManyToOne(fetch = FetchType.EAGER, optional = false)
  @JoinColumn(name = "managed_group_id", referencedColumnName = "managed_group_id", insertable = false, updatable = false)
  @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", insertable = false, updatable = false)
  private Employee employee;

  @Column(name = "population_tag_id", length = 3)
  private String populationTagId;

}
