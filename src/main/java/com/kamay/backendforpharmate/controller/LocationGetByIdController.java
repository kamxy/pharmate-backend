package com.kamay.backendforpharmate.controller;

import com.kamay.backendforpharmate.model.Location;
import com.kamay.backendforpharmate.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/api/v1/location/get/{id}")
public class LocationGetByIdController {

    @Autowired
    LocationService locationService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Optional<Location> getLocationById(@PathVariable int id) {
        return locationService.getLocationById(id);
    }
}
