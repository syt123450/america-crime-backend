package com.crime.presenter;

import com.crime.model.bean.ComboData;
import com.crime.model.domain.HeatPoint;
import com.crime.model.service.DataHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ss on 2018/5/12.
 */

@CrossOrigin
@RestController
@RequestMapping(value = "/data")
public class DataPresenter {

    private static Logger logger = Logger.getLogger(DataPresenter.class);
    private Gson gson = new GsonBuilder().create();

    @Autowired
    private DataHandler dataHandler;

    @RequestMapping(value = "/historyHeat", method = RequestMethod.GET)
    @ResponseBody
    public String getHistoryHeatData() {

        logger.info("Request for history heat data.");

        List<HeatPoint> heatPoints = dataHandler.getHistoryHeatData();

        return gson.toJson(heatPoints);
    }

    @RequestMapping(value = "/predictionHeat", method = RequestMethod.GET)
    @ResponseBody
    public String getPredictionHeatData() {

        logger.info("Request for caller heat data.");

        List<HeatPoint> heatPoints = dataHandler.getPredictionHeatData();

        return gson.toJson(heatPoints);
    }

    @RequestMapping(value = "/sunBurst", method = RequestMethod.GET)
    @ResponseBody
    public String getSunBurstData() {

        logger.info("Request for sun burst data");

        dataHandler.getSunData();

        return gson.toJson("");
    }

    @RequestMapping(value = "/combo", method = RequestMethod.GET)
    @ResponseBody
    public String getComboData() {

        logger.info("Request for combo chart data.");

        ComboData comboData = dataHandler.getComboData();

        return gson.toJson(comboData);
    }
}
