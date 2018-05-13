package com.crime.presenter;

import com.crime.model.bean.CriminalInfo;
import com.crime.model.bean.CriminalRequest;
import com.crime.model.bean.VictimsInfo;
import com.crime.model.bean.VictimsRequest;
import com.crime.model.service.PredictionHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ss on 2018/5/12.
 */

@CrossOrigin
@RestController
@RequestMapping(value = "/predict")
public class PredictionPresenter {

    private static Logger logger = Logger.getLogger(PredictionPresenter.class);
    private Gson gson = new GsonBuilder().create();

    @Autowired
    private PredictionHandler predictionHandler;

    @RequestMapping(value = "/criminal", method = RequestMethod.POST)
    @ResponseBody
    public String predictCriminal(@RequestBody String body) {

        logger.info("Request for caller criminal.");

        CriminalRequest criminalRequest = gson.fromJson(body, CriminalRequest.class);

        CriminalInfo criminalInfo = predictionHandler.predictCriminal(criminalRequest);

        return gson.toJson(criminalInfo);
    }

    @RequestMapping(value = "/victim", method = RequestMethod.POST)
    @ResponseBody
    public String predictVictim(@RequestBody String body) {

        logger.info("Request for predicting victim.");

        VictimsRequest victimsRequest = gson.fromJson(body, VictimsRequest.class);

        VictimsInfo victimsInfo = predictionHandler.predictVictims(victimsRequest);

        return gson.toJson(victimsInfo);
    }
}
