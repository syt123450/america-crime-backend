package com.crime.model.service.impl;

import com.crime.model.domain.HeatPoint;
import com.crime.model.service.DataHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ss on 2018/5/12.
 */

@Service
@Profile("dev")
public class DataHandlerImpl implements DataHandler {
    @Override
    public List<HeatPoint> getHistoryHeatData() {
        return null;
    }

    @Override
    public List<HeatPoint> getPredictionHeatData() {
        return null;
    }

    @Override
    public void getSunData() {

    }

    @Override
    public void getComboData() {

    }
}
