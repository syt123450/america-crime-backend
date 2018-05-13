package com.crime.model.service.impl.reader;

import com.crime.model.bean.VictimsInfo;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/13.
 */

@Component
public class VictimResultReader {

    public VictimsInfo getResult() {

        VictimsInfo victimsInfo = new VictimsInfo();

        return victimsInfo;
    }
}
