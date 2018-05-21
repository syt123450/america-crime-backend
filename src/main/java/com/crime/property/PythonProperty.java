package com.crime.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/14.
 */

@Service
public class PythonProperty {

    private static final String VERSION_2_COMMAND = "python";
    private static final String VERSION_3_COMMAND = "python3.6";
    private static String PYTHON_COMMAND;

    @Value("${python.version}")
    public void setPythonCommand(String pythonVersion) {
        if (pythonVersion.equals("2")) {
            PYTHON_COMMAND = VERSION_2_COMMAND;
        } else {
            PYTHON_COMMAND = VERSION_3_COMMAND;
        }
    }

    public String getPythonCommand() {
        return PYTHON_COMMAND;
    }
}
