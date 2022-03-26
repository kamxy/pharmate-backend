package com.kamay.backendforpharmate.service;

import com.kamay.backendforpharmate.model.Location;
import com.kamay.backendforpharmate.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    LocationRepository locationRepository;

    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }

    public Optional<Location> getLocationById(int id) {
        Optional<Location> location = locationRepository.findById(id);
        return location;
    }

}
