package me.jopimi.employee.repositories;

import me.jopimi.employee.entities.UserPopulation;
import me.jopimi.employee.entities.pks.UserPopulationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPopulationJpaRepository extends JpaRepository<UserPopulation, UserPopulationId> {

  @Query("""
          SELECT up
          FROM UserPopulation up
          LEFT JOIN FETCH up.employee e
          LEFT JOIN FETCH e.workdays
          WHERE up.id.roleId = :roleId
          AND up.id.populationId = :populationId
          """)
  List<UserPopulation> findPopulation(String roleId, Integer populationId);
}
