package com.crime.model.dao;

import com.crime.model.domain.StateTotal;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ss on 2018/5/14.
 */

@Repository
public interface SunDao {

    List<Integer> getMonthData();

    List<StateTotal> getStateData();
}
