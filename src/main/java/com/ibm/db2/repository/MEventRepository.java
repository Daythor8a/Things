package com.ibm.db2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.db2.entity.MEvent;

public interface MEventRepository extends JpaRepository<MEvent, Integer>
{
  List<MEvent> findAll();
  }
