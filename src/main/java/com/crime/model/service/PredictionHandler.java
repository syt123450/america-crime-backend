package com.crime.model.service;

import com.crime.model.bean.CriminalInfo;
import com.crime.model.bean.CriminalRequest;
import com.crime.model.bean.VictimsInfo;
import com.crime.model.bean.VictimsRequest;

/**
 * Created by ss on 2018/5/12.
 */

public interface PredictionHandler {

    VictimsInfo predictVictims(VictimsRequest victimsRequest);

    CriminalInfo predictCriminal(CriminalRequest criminalRequest);
}
