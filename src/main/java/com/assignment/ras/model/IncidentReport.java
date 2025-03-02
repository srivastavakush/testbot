package com.assignment.ras.model;

public class IncidentReport {
    private String irNumber;
    private String groupRefNo;
    
    public IncidentReport(String irNumber, String groupRefNo) {
        this.irNumber = irNumber;
        this.groupRefNo = groupRefNo;
    }
    
    public String getIrNumber() { return irNumber; }
    public String getGroupRefNo() { return groupRefNo; }
}
