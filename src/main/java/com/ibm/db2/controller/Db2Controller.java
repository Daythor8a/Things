package com.ibm.db2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.db2.entity.Things;
import com.ibm.db2.mapping.Db2Mapping;
import com.ibm.db2.model.ThingsRequest;
import com.ibm.db2.model.ThingsResponse;
import com.ibm.db2.repository.ThingsRepository;
import com.ibm.db2.service.ThingsService;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author edgar.ochoa
 *
 */
@Slf4j
@RestController
@RequestMapping("api/")
public class Db2Controller {

    /**
     * Repository Instance
     */
    @Autowired
    private ThingsRepository repo;
    
    /**
     * Service Instance
     */
    @Autowired
    private ThingsService service;
    
    /**
     * Map Instance
     */
    @Autowired
    private Db2Mapping map;

    /**
     * Method that Loads & Saves Data
     * @param request
     * @return
     */
    @PostMapping(value="test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ThingsResponse> example(@RequestBody(required = true) ThingsRequest request) {
        log.info(request.getNombre() + " ****..........**** ");   
        repo.save(map.buildThing(request));
        List<Things> lstThings = repo.findAll();     
        
        return new ResponseEntity<>(map.buildResponse(lstThings), HttpStatus.OK);
    }
    
    /**
     * Method than only Retrives Data
     * @param request
     * @return
     */
    @GetMapping(value="load", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ThingsResponse> loadThings( ThingsRequest request) {
        log.info(request.getNombre() + " ****..........**** ");   
        
        ThingsResponse response = service.loadThingsDetails(request);
               
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    /**
     * Method that only Saves Data
     * @param request
     * @return
     */
    @PostMapping(value="save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ThingsResponse> saveThings(@RequestBody(required = true) ThingsRequest request) {
        log.info(request.getNombre() + " ****..........**** ");   
        ThingsResponse response = service.saveThingsDetails(request);         
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
