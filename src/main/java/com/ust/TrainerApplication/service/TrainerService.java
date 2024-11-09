package com.ust.TrainerApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.TrainerApplication.model.TrainerInfo;
import com.ust.TrainerApplication.repository.TrainerRepository;

@Service
public class TrainerService {
    @Autowired
    private TrainerRepository repository;

    public TrainerInfo addtrainer(TrainerInfo trainerInfo)
    {
        return repository.save(trainerInfo);
    }
    
    public List<TrainerInfo> getTrainer()
    {
        return repository.findAll();
    }
    public TrainerInfo gettrainerbyid(Long id)
    {
        return repository.findById(id).orElse(null);
    }
    public String deletetrainerinfo(Long id)
    {
        repository.deleteById(id);
        return "Trainer "+id+" deleted";
    }
    public TrainerInfo updatetrainerdetails(Long id,TrainerInfo trainerInfo)
    {
        TrainerInfo existingTrainerInfo = repository.findById(id).orElse(null);
        existingTrainerInfo.setName(trainerInfo.getName());
        existingTrainerInfo.setEmail(trainerInfo.getEmail());
        existingTrainerInfo.setSkills(trainerInfo.getSkills());
        existingTrainerInfo.setContactNumber(trainerInfo.getContactNumber());
        existingTrainerInfo.setQualification(trainerInfo.getQualification());
        existingTrainerInfo.setExperience(trainerInfo.getExperience());
        return repository.save(existingTrainerInfo);
    }
}
