package com.crime.model.service.impl;

import com.crime.model.bean.CriminalInfo;
import com.crime.model.bean.CriminalRequest;
import com.crime.model.bean.VictimsInfo;
import com.crime.model.bean.VictimsRequest;
import com.crime.model.dao.StateDao;
import com.crime.model.domain.Position;
import com.crime.model.service.PredictionHandler;
import com.crime.model.service.impl.caller.CriminalModelCaller;
import com.crime.model.service.impl.caller.VictimModelCaller;
import com.crime.model.service.impl.reader.CriminalResultReader;
import com.crime.model.service.impl.reader.VictimResultReader;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/12.
 */

@Service
@Profile("dev")
public class PredictionHandlerImpl implements PredictionHandler {

    private static Logger logger = Logger.getLogger(PredictionHandlerImpl.class);

    @Autowired
    private VictimModelCaller victimModelCaller;
    @Autowired
    private CriminalModelCaller criminalModelCaller;
    @Autowired
    private VictimResultReader victimResultReader;
    @Autowired
    private CriminalResultReader criminalResultReader;
    @Autowired
    private StateDao stateDao;

    @Override
    public VictimsInfo predictVictims(VictimsRequest victimsRequest) {

        Position statePosition = stateDao.getStatePosition(victimsRequest.getState());

        victimModelCaller.call(victimsRequest, statePosition);
        VictimsInfo victimsInfo = victimResultReader.getResult();

        logger.info("Victim prediction result is: " + victimsInfo);

        return victimsInfo;
    }

    @Override
    public CriminalInfo predictCriminal(CriminalRequest criminalRequest) {

        Position statePosition = stateDao.getStatePosition(criminalRequest.getState());

        criminalModelCaller.call(criminalRequest, statePosition);
        CriminalInfo criminalInfo = criminalResultReader.getResult();

        logger.info("Criminal prediction result is: " + criminalInfo);

        return criminalInfo;
    }
}
