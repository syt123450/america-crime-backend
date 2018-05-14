package com.crime.model.service.impl.combiner;

import com.crime.model.bean.SunBurstData;
import com.crime.property.ColorProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/14.
 */

@Component
public class SunBurstCombiner {

    private static String YEAR_COLOR;
    private static String QUARTER_COLOR;
    private static String MONTH_COLOR;
    private static String STATE_COLOR;

    @Autowired
    public void setColor(ColorProperty colorProperty) {
        YEAR_COLOR = colorProperty.getYearColor();
        QUARTER_COLOR = colorProperty.getQuarterColor();
        MONTH_COLOR = colorProperty.getMonthColor();
        STATE_COLOR = colorProperty.getStateColor();
    }

    public SunBurstData construct() {

        SunBurstData sunBurstData = new SunBurstData();




        return sunBurstData;
    }
}
