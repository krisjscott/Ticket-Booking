package com.irctc.model;

import java.util.Map;
import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Train {

    private String trainId;
    private String TrainNo;
    private Time Departure;
    private Time arrival;
    private List<List<Integer>> seats;
    private Map<String, Date> stationTime;
    private List<String> stations;
}
