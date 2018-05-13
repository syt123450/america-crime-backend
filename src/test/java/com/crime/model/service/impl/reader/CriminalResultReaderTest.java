package com.crime.model.service.impl.reader;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by ss on 2018/5/13.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CriminalResultReaderTest {

    @Autowired
    private CriminalResultReader criminalResultReader;

    @Test
    @Ignore
    public void testGetResult() {
        System.out.println(criminalResultReader.getResult());
    }
}