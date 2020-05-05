package com.ibm.db2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Class that represents the MEvent Table
 * @author edgar.ochoa
 *
 */

@Getter
@Setter
@Entity
public class MEvent {
  /**
   * Id of the MEvent Table
   */
  @Id
  private int id_evnt;
  
  /**
   * Name of the Event
   */
  private String nam_evnt;
  
  /**
   * Oportunity Number
   */
  private String op_evnt;
  
  /**
   * Foreign Key that reffers
   * to the Id of CEventType Catalog Table
   */
  private int id_ety;
  
  /**
   * The Date of the Event
   */
  private String date_evnt;
  
  /**
   * Starting Hour of the Event
   */
  private String shr_evnt;
  
  /**
   * Ending Hour of the Event
   */
  private String ehr_evnt;
  
  /**
   * Foreign Key that reffers
   * to the Id of CBrandSolution Catalog Table
   */
  private int id_bra;
  
  /**
   * Foreign Key that reffers
   * to the Id of CIndustry Catalog Table
   */
  private int id_ind;
  
  /**
   * Number of Attendees
   */
  private int att_envt;
  
  /**
   * Foreign Key that reffers
   * to the Id of CAttendeeType Catalog Table
   */
  private int id_atty;
  
  /**
   * MEvent Constructor
   */
  public MEvent() {}

}
