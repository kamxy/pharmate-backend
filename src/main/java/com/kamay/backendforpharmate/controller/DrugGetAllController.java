package com.kamay.backendforpharmate.controller;

import com.kamay.backendforpharmate.model.Drug;
import com.kamay.backendforpharmate.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drug/getall")
public class DrugGetAllController {
    @Autowired
    DrugService drugService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Drug>> listAllDrug() {
        return ResponseEntity.ok().body(drugService.getAllDrug());
    }

}
