package com.crime.model.service.mock;

import com.crime.model.domain.HeatPoint;
import com.crime.model.service.DataHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/5/12.
 */

@Service
@Profile("mock")
public class MockDataHandler implements DataHandler {
    @Override
    public List<HeatPoint> getHistoryHeatData() {

        List<HeatPoint> heatPoints = new ArrayList<>();

        HeatPoint heatPoint1 = new HeatPoint(37.782551, -122.445368);
        HeatPoint heatPoint2 = new HeatPoint(37.782745, -122.444586);
        HeatPoint heatPoint3 = new HeatPoint(37.782842, -122.443688);
        HeatPoint heatPoint4 = new HeatPoint(37.782919, -122.442815);
        HeatPoint heatPoint5 = new HeatPoint(37.782992, -122.442112);

        heatPoints.add(heatPoint1);
        heatPoints.add(heatPoint2);
        heatPoints.add(heatPoint3);
        heatPoints.add(heatPoint4);
        heatPoints.add(heatPoint5);

        return heatPoints;
    }

    @Override
    public List<HeatPoint> getPredictionHeatData() {

        List<HeatPoint> heatPoints = new ArrayList<>();

        HeatPoint heatPoint1 = new HeatPoint(37.782551, -122.445368);
        HeatPoint heatPoint2 = new HeatPoint(37.782745, -122.444586);
        HeatPoint heatPoint3 = new HeatPoint(37.782842, -122.443688);
        HeatPoint heatPoint4 = new HeatPoint(37.782919, -122.442815);
        HeatPoint heatPoint5 = new HeatPoint(37.782992, -122.442112);

        heatPoints.add(heatPoint1);
        heatPoints.add(heatPoint2);
        heatPoints.add(heatPoint3);
        heatPoints.add(heatPoint4);
        heatPoints.add(heatPoint5);

        return heatPoints;
    }

    @Override
    public void getSunData() {

    }

    @Override
    public void getComboData() {

    }
}
