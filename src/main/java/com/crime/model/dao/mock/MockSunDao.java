package com.crime.model.dao.mock;

import com.crime.model.dao.SunDao;
import com.crime.model.domain.StateTotal;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/5/14.
 */

@Service
@Profile("dev")
public class MockSunDao implements SunDao {
    @Override
    public List<Integer> getMonthData() {

        List<Integer> monthData = new ArrayList<>();

        for (int i = 0; i < 72; i++) {
            monthData.add(0);
        }

        return monthData;
    }

    @Override
    public List<StateTotal> getStateData() {

        List<StateTotal> stateData = new ArrayList<>();

        for (int i = 0; i < 360; i++) {
            stateData.add(new StateTotal("CA", 20));
        }

        return stateData;
    }
}
