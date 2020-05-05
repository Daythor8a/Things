package com.ibm.db2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MEventRequest {
  
  private int idEvento;
  private String nombreEvento;
  private String numeroOportunidad;
  private int idEventType;
  private String FechaEvento;
  private String horaInicio;
  private String horaFin;
  private int idBrandSolution;
  private int idIndustry;
  private int numeroAsistentes;
  private int idAttendeeType;

}
