package com.ibm.db2.model;

import java.util.List;
import com.ibm.db2.entity.MEvent;
import lombok.Getter;
import lombok.Setter;

/**
 * Response Class with a list of MEvent
 * @author edgar.ochoa
 *
 */
@Getter
@Setter
public class MEventResponse {
  /**
   * Gets & Sets A MEvent List
   */
  List<MEvent> lstMEvent;

}
