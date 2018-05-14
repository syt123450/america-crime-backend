package com.crime.model.service.impl.combiner;

import com.crime.model.bean.ComboData;
import com.crime.model.utils.SeriesUtils;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/14.
 */

@Component
public class ComboCombiner {

    public ComboData constructor() {

        ComboData comboData = new ComboData();

        int[] averageData = new int[]{26, 711, 809, 912, 924, 194};

        comboData.setAverage(SeriesUtils.generateSeries(averageData));

        int[] top1Killed = new int[]{46, 1320, 688, 946, 959, 165};
        int[] top1Injured = new int[]{139, 1607, 2822, 4137, 3629, 572};
        int[] top2Killed = new int[]{14, 637, 1204, 1265, 1423, 304};
        int[] top2Injured = new int[]{78, 2276, 1617, 1896, 1953, 432};
        int[] top3Killed = new int[]{13, 873, 1136, 1313, 950, 310};
        int[] top3Injured = new int[]{58, 1463, 1355, 1614, 1801, 374};


        comboData.setTop1Killed(SeriesUtils.generateSeries(top1Killed));
        comboData.setTop1Injured(SeriesUtils.generateSeries(top1Injured));
        comboData.setTop2Killed(SeriesUtils.generateSeries(top2Killed));
        comboData.setTop2Injured(SeriesUtils.generateSeries(top2Injured));
        comboData.setTop3Killed(SeriesUtils.generateSeries(top3Killed));
        comboData.setTop3Injured(SeriesUtils.generateSeries(top3Injured));

        return comboData;
    }
}
