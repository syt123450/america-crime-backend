package com.crime.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/12.
 */

@Service
public class PathProperty {

    private static String BASE_DIR;
    private static String CRIMINAL_DIR;
    private static String CRIMINAL_PREDICT_DIR;
    private static String CRIMINAL_RESULT_DIR;
    private static String VICTIM_DIR;
    private static String VICTIM_PREDICT_DIR;
    private static String VICTIM_RESULT_DIR;

    @Value("${dir.base}")
    public void setBaseDir(String baseDir) {
        BASE_DIR = baseDir;
    }

    @Value("${dir.criminal}")
    public void setCriminalDir(String criminalDir) {
        CRIMINAL_DIR = criminalDir;
    }

    @Value("${dir.criminal.predict}")
    public void setCriminalModelDir(String criminalModelDir) {
        CRIMINAL_PREDICT_DIR = criminalModelDir;
    }

    @Value("${dir.criminal.result}")
    public void setCriminalResultDir(String criminalResultDir) {
        CRIMINAL_RESULT_DIR = criminalResultDir;
    }

    @Value("${dir.victim}")
    public void setVictimDir(String victimDir) {
        VICTIM_DIR = victimDir;
    }

    @Value("${dir.victim.predict}")
    public void setVictimModelDir(String victimModelDir) {
        VICTIM_PREDICT_DIR = victimModelDir;
    }

    @Value("${dir.victim.output}")
    public void setVictimResultDir(String victimResultDir) {
        VICTIM_RESULT_DIR = victimResultDir;
    }

    public String getBaseDir() {
        return BASE_DIR;
    }

    public String getCriminalDir() {
        return CRIMINAL_DIR;
    }

    public String getCriminalPredictDir() {
        return CRIMINAL_PREDICT_DIR;
    }

    public String getCriminalResultDir() {
        return CRIMINAL_RESULT_DIR;
    }

    public String getVictimDir() {
        return VICTIM_DIR;
    }

    public String getVictimPredictDir() {
        return VICTIM_PREDICT_DIR;
    }

    public String getVictimResultDir() {
        return VICTIM_RESULT_DIR;
    }
}
