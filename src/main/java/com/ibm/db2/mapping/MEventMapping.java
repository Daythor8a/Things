package com.ibm.db2.mapping;

import org.springframework.stereotype.Component;
import com.ibm.db2.entity.MEvent;
import com.ibm.db2.model.MEventRequest;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Component
public class MEventMapping {
  
  /**
   * Method that Maps MEvent
   * @param request
   * @return
   */
  public MEvent buildMEvent(MEventRequest request) {
    MEvent response = new MEvent();
    response.setId_evnt(request.getIdEvento());
    response.setNam_evnt(request.getNombreEvento());
    response.setOp_evnt(request.getNumeroOportunidad());
    response.setId_ety(request.getIdEventType());
    response.setDate_evnt(request.getFechaEvento());
    response.setShr_evnt(request.getHoraInicio());
    response.setEhr_evnt(request.getHoraFin());
    response.setId_bra(request.getIdBrandSolution());
    response.setId_ind(request.getIdIndustry());
    response.setAtt_envt(request.getNumeroAsistentes());
    response.setId_atty(request.getIdAttendeeType());
    return response;
  }

}
