package com.crime.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/12.
 */

@Service
public class PathProperty {

    private static String BASE_DIR;

    @Value("${dir.base}")
    public void setBaseDir(String baseDir) {
        BASE_DIR = baseDir;
    }

    public String getBaseDir() {
        return BASE_DIR;
    }
}
