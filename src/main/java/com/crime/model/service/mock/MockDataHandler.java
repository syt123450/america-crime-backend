package com.crime.model.service.mock;

import com.crime.model.bean.ComboData;
import com.crime.model.bean.SunBurstData;
import com.crime.model.domain.HeatPoint;
import com.crime.model.service.DataHandler;
import com.crime.model.utils.SeriesUtils;
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
    public SunBurstData getSunData() {
        return null;
    }

    @Override
    public ComboData getComboData() {
        ComboData comboData = new ComboData();

        int[] averageData = new int[]{3, 2, 22, 18, 18, 18};

        comboData.setAverage(SeriesUtils.generateSeries(averageData));

        int[] top1Killed = new int[]{10, 5, 15, 20, 20, 20};
        int[] top1Injured = new int[]{3, 7, 2, 1, 1, 1};
        int[] top2Killed = new int[]{22, 8, 11, 19, 19, 19};
        int[] top2Injured = new int[]{3, 2, 22, 18, 18, 18};
        int[] top3Killed = new int[]{10, 5, 15, 20, 20, 20};
        int[] top3Injured = new int[]{3, 7, 2, 1, 1, 1};


        comboData.setTop1Killed(SeriesUtils.generateSeries(top1Killed));
        comboData.setTop1Injured(SeriesUtils.generateSeries(top1Injured));
        comboData.setTop2Killed(SeriesUtils.generateSeries(top2Killed));
        comboData.setTop2Injured(SeriesUtils.generateSeries(top2Injured));
        comboData.setTop3Killed(SeriesUtils.generateSeries(top3Killed));
        comboData.setTop3Injured(SeriesUtils.generateSeries(top3Injured));

        return comboData;
    }
}
