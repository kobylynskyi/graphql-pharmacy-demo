package com.kobylynskyi.pharmacy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.joda.time.DateTime;

@Data
@AllArgsConstructor
public class Prescription {

    private String id;
    private String drugId;
    private String patientId;
    private DateTime dateTime;
    private String usage;
    private int refills;
}
