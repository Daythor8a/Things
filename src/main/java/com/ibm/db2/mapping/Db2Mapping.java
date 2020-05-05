package com.ibm.db2.mapping;

import java.util.List;
import org.springframework.stereotype.Component;
import com.ibm.db2.entity.Things;
import com.ibm.db2.model.ThingsRequest;
import com.ibm.db2.model.ThingsResponse;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Component
public class Db2Mapping {
  /**
   * Mapping Things Method
   * @param request
   * @return
   */
  public Things buildThing(ThingsRequest request) {  
    Things response = new Things();
    response.setId(request.getId());
    response.setName(request.getNombre());
    return response;
  }
  
  /**
   * Maps the Things Response & builds a List of Things
   * @param things
   * @return
   */
  public ThingsResponse buildResponse(List<Things> lstThings) {
    ThingsResponse response = new ThingsResponse();
    response.setLstThings(lstThings);
    return response;
  }

}
