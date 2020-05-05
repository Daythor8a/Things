package com.ibm.db2.model;

import java.util.List;
import com.ibm.db2.entity.Things;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Getter
@Setter
public class ThingsResponse {
  
  /**
   * A List Of Things
   */
  List<Things> lstThings;

}
