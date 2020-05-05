package com.ibm.db2.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.db2.entity.Things;
import com.ibm.db2.mapping.Db2Mapping;
import com.ibm.db2.model.ThingsRequest;
import com.ibm.db2.model.ThingsResponse;
import com.ibm.db2.repository.ThingsRepository;
import com.ibm.db2.service.ThingsService;

/**
 * Implementation Service Class for ThingsService interface
 * @author edgar.ochoa
 *
 */
@Service
public class ThingsServiceImpl implements ThingsService{
  
  /**
   * Repository Instance
   */
  @Autowired
  private ThingsRepository repo;
  
  /**
   * Map Instance
   */
  @Autowired
  private Db2Mapping map;

  /**
   * Implemented saveThingsDetails Method
   */
  @Override
  public ThingsResponse saveThingsDetails(ThingsRequest request) {
    ThingsResponse responseThings = new ThingsResponse();
    repo.save(map.buildThing(request)); 
    return responseThings;
  }

  /**
   * Implemented loadThingsDetails Method
   */
  @Override
  public ThingsResponse loadThingsDetails(ThingsRequest request) {
    List<Things> lstThings = repo.findAll();   
    return map.buildResponse(lstThings);
  }

}
