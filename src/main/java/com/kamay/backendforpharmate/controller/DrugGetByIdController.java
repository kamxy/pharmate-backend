package com.kamay.backendforpharmate.controller;

import com.kamay.backendforpharmate.model.Drug;
import com.kamay.backendforpharmate.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/api/v1/drug/get/{id}")
public class DrugGetByIdController {
    @Autowired
    DrugService drugService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Optional<Drug> getDrugById(@PathVariable int id) {
        return drugService.getDrugById(id);
    }
}
