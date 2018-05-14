package com.crime.model.service.impl.combiner;

import com.crime.model.bean.ArcSeries;
import com.crime.model.bean.SunBurstData;
import com.crime.model.dao.SunDao;
import com.crime.model.dao.mock.MockSunDao;
import com.crime.model.domain.StateTotal;
import com.crime.property.ColorProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/5/14.
 */

@Component
public class SunBurstCombiner {

    private static final String[] MONTH = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final String[] QUARTER = new String[]{"Quarter 1", "Quarter 2", "Quarter 3", "Quarter 4"};
    private static final String[] YEAR = new String[]{"2013", "2014", "2015", "2016", "2017", "2018"};
    private static String YEAR_COLOR;
    private static String QUARTER_COLOR;
    private static String MONTH_COLOR;
    private static String STATE_COLOR;

    @Autowired
    private SunDao sunDao;

    @Autowired
    public void setColor(ColorProperty colorProperty) {
        YEAR_COLOR = colorProperty.getYearColor();
        QUARTER_COLOR = colorProperty.getQuarterColor();
        MONTH_COLOR = colorProperty.getMonthColor();
        STATE_COLOR = colorProperty.getStateColor();
    }

    public SunBurstData construct() {

        SunBurstData sunBurstData = new SunBurstData();

        List<Integer> monthData = sunDao.getMonthData();
        List<StateTotal> stateData = sunDao.getStateData();

        List<ArcSeries> stateSeriesList = new ArrayList<>();
        for (int i = 0; i < stateData.size(); i++) {

            ArcSeries stateSeries = new ArcSeries(stateData.get(i).getState(),
                    STATE_COLOR,
                    stateData.get(i).getTotal());

            stateSeries.setChildren(null);

            stateSeriesList.add(stateSeries);
        }

        List<ArcSeries> monthSeriesList = new ArrayList<>();
        for (int i = 0; i < monthData.size(); i++) {

            double seed = Math.random() + 0.3;
            double random = seed > 1 ? 1 : seed;

            ArcSeries monthSeries = new ArcSeries(MONTH[i % 12], MONTH_COLOR, (int)(monthData.get(i) * random));

            List<ArcSeries> stateForMonthList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                stateForMonthList.add(stateSeriesList.get(5 * i + j));
                monthSeries.setSize(monthSeries.getSize() - stateSeriesList.get(5 * i + j).getSize());
            }

            monthSeries.setChildren(stateForMonthList);

            monthSeriesList.add(monthSeries);
        }

        List<ArcSeries> quarterSeriesList = new ArrayList<>();

        for (int i = 0; i < 24; i++) {

            ArcSeries quarterSeries = new ArcSeries(QUARTER[i % 4], QUARTER_COLOR);

            List<ArcSeries> monthForQuarterList = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                monthForQuarterList.add(monthSeriesList.get(3 * i + j));
            }

            quarterSeries.setChildren(monthForQuarterList);

            quarterSeriesList.add(quarterSeries);
        }

        List<ArcSeries> yearSeriesList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {

            ArcSeries yearSeries = new ArcSeries(YEAR[i], YEAR_COLOR);

            List<ArcSeries> quarterForYearList = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                quarterForYearList.add(quarterSeriesList.get(4 * i + j));
            }

            yearSeries.setChildren(quarterForYearList);

            yearSeriesList.add(yearSeries);
        }

        sunBurstData.setChildren(yearSeriesList);

        return sunBurstData;
    }
}
