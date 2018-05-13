package com.crime.model.service.mock;

import com.crime.model.bean.CriminalInfo;
import com.crime.model.bean.CriminalRequest;
import com.crime.model.bean.VictimsInfo;
import com.crime.model.bean.VictimsRequest;
import com.crime.model.service.PredictionHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/12.
 */

@Service
@Profile("mock")
public class MockPredictionHandler implements PredictionHandler {

    @Override
    public VictimsInfo predictVictims(VictimsRequest victimsRequest) {

        VictimsInfo victimsInfo = new VictimsInfo(2, 3);

        return victimsInfo;
    }

    @Override
    public CriminalInfo predictCriminal(CriminalRequest criminalRequest) {

        CriminalInfo criminalInfo = new CriminalInfo(1, 2, 3);

        return criminalInfo;
    }
}
