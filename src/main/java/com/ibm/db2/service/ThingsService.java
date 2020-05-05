package com.ibm.db2.service;

import org.springframework.stereotype.Service;
import com.ibm.db2.model.ThingsRequest;
import com.ibm.db2.model.ThingsResponse;

/**
 * 
 * @author edgar.ochoa
 *
 */
public interface ThingsService {
  
  /**
   * Abstract Method that saves Things Details
   * @param request
   * @return
   */
  ThingsResponse saveThingsDetails(ThingsRequest request);
  
  /**
   * Abstract Method that loads Things Details
   * @param request
   * @return
   */
  ThingsResponse loadThingsDetails(ThingsRequest request);
    
  

}
