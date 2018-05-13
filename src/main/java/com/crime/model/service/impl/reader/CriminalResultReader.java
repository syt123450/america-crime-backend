package com.crime.model.service.impl.reader;

import com.crime.model.bean.CriminalInfo;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/13.
 */

@Component
public class CriminalResultReader {

    public CriminalInfo getResult() {

        CriminalInfo criminalInfo = new CriminalInfo();

        return criminalInfo;

    }

}
