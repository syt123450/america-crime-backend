package com.crime.model.utils;

import com.crime.model.bean.GraphicPointBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/5/13.
 */
public class SeriesUtils {

    public static List<GraphicPointBean> generateSeries(int[] numbers) {

        List<GraphicPointBean> pointBeans = new ArrayList<>();

        GraphicPointBean bean2013 = new GraphicPointBean("2013", numbers[0]);
        GraphicPointBean bean2014 = new GraphicPointBean("2014", numbers[1]);
        GraphicPointBean bean2015 = new GraphicPointBean("2015", numbers[2]);
        GraphicPointBean bean2016 = new GraphicPointBean("2016", numbers[3]);
        GraphicPointBean bean2017 = new GraphicPointBean("2017", numbers[4]);
        GraphicPointBean bean2018 = new GraphicPointBean("2018", numbers[5]);
        pointBeans.add(bean2013);
        pointBeans.add(bean2014);
        pointBeans.add(bean2015);
        pointBeans.add(bean2016);
        pointBeans.add(bean2017);
        pointBeans.add(bean2018);

        return pointBeans;
    }

}
