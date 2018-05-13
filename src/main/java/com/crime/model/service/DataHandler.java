package com.crime.model.service;

import com.crime.model.bean.ComboData;
import com.crime.model.domain.HeatPoint;

import java.util.List;

/**
 * Created by ss on 2018/5/12.
 */
public interface DataHandler {

    List<HeatPoint> getHistoryHeatData();

    List<HeatPoint> getPredictionHeatData();

    void getSunData();

    ComboData getComboData();
}
