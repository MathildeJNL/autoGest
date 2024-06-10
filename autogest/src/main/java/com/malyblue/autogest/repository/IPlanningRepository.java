package com.malyblue.autogest.repository;

import com.malyblue.autogest.entity.Planning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlanningRepository extends JpaRepository<Planning, Integer> {
}
