package com.kamay.backendforpharmate.controller;

import com.kamay.backendforpharmate.model.Location;
import com.kamay.backendforpharmate.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/location/getall")
public class LocationGetAllController {
    @Autowired
    LocationService locationService;

    
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Location>> listAllLocation() {
        return ResponseEntity.ok().body(locationService.getAllLocation());
    }


}
