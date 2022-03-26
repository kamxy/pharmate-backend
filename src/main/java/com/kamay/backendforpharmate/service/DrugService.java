package com.kamay.backendforpharmate.service;

import com.kamay.backendforpharmate.model.Drug;
import com.kamay.backendforpharmate.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DrugService {
    @Autowired
    DrugRepository drugRepository;

    public List<Drug> getAllDrug() {
        return drugRepository.findAll();
    }

    public Optional<Drug> getDrugById(int id) {
        Optional<Drug> drug = drugRepository.findById(id);
        return drug;
    }
}
