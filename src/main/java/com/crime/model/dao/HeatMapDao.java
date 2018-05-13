package com.crime.model.dao;

import com.crime.model.domain.HeatPoint;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ss on 2018/5/12.
 */

@Repository
public interface HeatMapDao {

    List<HeatPoint> getHistoryHeatPoints();

    List<HeatPoint> getPredictionHeatPoints();
}
