package com.ust.TrainerApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.TrainerApplication.model.TrainerInfo;
@Repository
public interface TrainerRepository extends JpaRepository<TrainerInfo,Long>{
    
}
