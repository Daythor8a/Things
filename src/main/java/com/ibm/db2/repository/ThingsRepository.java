package com.ibm.db2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.db2.entity.Things;

public interface ThingsRepository extends JpaRepository<Things, Integer>
{
  List<Things> findByName(String name);
}
