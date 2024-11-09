package com.ust.TrainerApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.TrainerApplication.model.TrainerInfo;
import com.ust.TrainerApplication.service.TrainerService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/ust")
public class TrainerController {
    @Autowired
    private TrainerService service;
    @PostMapping("/addTrainer")
    public TrainerInfo addtrainer(@RequestBody TrainerInfo trainerInfo)
    {
        return service.addtrainer(trainerInfo);
    }
    @GetMapping("/getTrainer")
    public List<TrainerInfo> getTrainer()
    {
        return service.getTrainer();
    }
    @GetMapping("/getTrainer/{id}")
    public TrainerInfo gettrainerbyid(@PathVariable Long id)
    {
        return service.gettrainerbyid(id);
    }
    @DeleteMapping({"/delete/{id}"})
    public String deletetrainerinfo(@PathVariable Long id)
    {
        return service.deletetrainerinfo(id);
    }
    @PutMapping("/updateTrainerInfo/{id}")
    public TrainerInfo updatetrainerdetails(@PathVariable Long id,@RequestBody TrainerInfo trainerinfo)
    {
        return service.updatetrainerdetails(id,trainerinfo);
    }
}
