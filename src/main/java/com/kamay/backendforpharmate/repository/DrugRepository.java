package com.kamay.backendforpharmate.repository;

import com.kamay.backendforpharmate.model.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepository extends JpaRepository<Drug,Integer> {
}
