package com.crime.model.dao.mock;

import com.crime.model.dao.SunDao;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by ss on 2018/5/14.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MockSunDaoTest {

    @Autowired
    private MockSunDao sunDao;

    @Test
    @Ignore
    public void testSunDao() {
        System.out.println(sunDao.getMonthData().size());
        System.out.println(sunDao.getStateData().size());
    }

}