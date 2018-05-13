package com.crime.model.service.impl.reader;

import com.crime.model.bean.VictimsInfo;
import com.crime.property.PathProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/5/13.
 */

@Component
public class VictimResultReader {

    private static String RESULT_PATH;

    @Autowired
    public void setResultPath(PathProperty pathProperty) {
        RESULT_PATH = pathProperty.getVictimResultDir();
    }

    public VictimsInfo getResult() {

        VictimsInfo victimsInfo = new VictimsInfo();

        try {

            FileInputStream inputStream = new FileInputStream(new File(RESULT_PATH));
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            String[] tempElements;

            String line1 = br.readLine();
            tempElements = line1.split(" ");
            victimsInfo.setKilled(Integer.parseInt(tempElements[1]));

            String line2 = br.readLine();
            tempElements = line2.split(" ");
            victimsInfo.setInjured(Integer.parseInt(tempElements[1]));

            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return victimsInfo;
    }
}
