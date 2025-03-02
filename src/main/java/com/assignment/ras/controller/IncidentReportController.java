package com.assignment.ras.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import com.assignment.ras.model.IncidentReport;
import com.assignment.ras.repo.IncidentReportRepository;

@RestController
@RequestMapping("/incident")
public class IncidentReportController {
	
    @Autowired
    private IncidentReportRepository incidentReportRepository;
    
    @GetMapping("/{irNumber}")
    public IncidentReport getIncidentByIRNumber(@PathVariable String irNumber) {
        return incidentReportRepository.findByIrNumber(irNumber);
    }
}