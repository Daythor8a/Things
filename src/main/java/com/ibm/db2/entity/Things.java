package com.ibm.db2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Class That Reffers to Things Table
 * @author edgar.ochoa
 *
 */
@Getter
@Setter
@Entity
public class Things {
  
  /**
   * Things Id
   */
  @Id
  private int id;
  
  /**
   * Things Name
   */
  private String name;
  
  /**
   * Things Constructor
   */
  public Things(){
  }
  
  
}
