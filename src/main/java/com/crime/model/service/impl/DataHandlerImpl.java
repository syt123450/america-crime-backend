package com.crime.model.service.impl;

import com.crime.model.bean.ComboData;
import com.crime.model.bean.SunBurstData;
import com.crime.model.dao.HeatMapDao;
import com.crime.model.domain.HeatPoint;
import com.crime.model.service.DataHandler;
import com.crime.model.service.impl.combiner.ComboCombiner;
import com.crime.model.service.impl.combiner.SunBurstCombiner;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ss on 2018/5/12.
 */

@Service
@Profile("dev")
public class DataHandlerImpl implements DataHandler {

    private static Logger logger = Logger.getLogger(DataHandlerImpl.class);

    @Autowired
    private HeatMapDao heatMapDao;
    @Autowired
    private SunBurstCombiner sunBurstCombiner;
    @Autowired
    private ComboCombiner comboCombiner;

    @Override
    public List<HeatPoint> getHistoryHeatData() {

        logger.info("Get History heat map data.");

        List<HeatPoint> heatPoints = heatMapDao.getHistoryHeatPoints();

        logger.info("Size of history points: " + heatPoints.size());

        return heatPoints;
    }

    @Override
    public List<HeatPoint> getPredictionHeatData() {

        logger.info("Get Prediction heat map data.");

        List<HeatPoint> heatPoints = heatMapDao.getPredictionHeatPoints();

        logger.info("Size of prediction points: " + heatPoints.size());

        return heatPoints;
    }

    @Override
    public SunBurstData getSunData() {

        return sunBurstCombiner.construct();
    }

    @Override
    public ComboData getComboData() {

        return comboCombiner.constructor();
    }
}
