package com.crime.model.dao;

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
public class StateDaoTest {

    @Autowired
    private StateDao stateDao;

    @Test
    @Ignore
    public void testGetStatePosition() {
        System.out.println(stateDao.getStatePosition("CA"));
    }
}