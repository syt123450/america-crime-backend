package com.crime.model.service.impl.caller;

import com.crime.property.PathProperty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/13.
 */

@Component
public class VictimModelCaller implements Caller {

    private static final String SCRIPT_RAW = "";
    private static String SCRIPT_TEMPLATE;

    private static Logger logger = Logger.getLogger(VictimModelCaller.class);

    @Autowired
    public void initTemplate(PathProperty pathProperty) {
        SCRIPT_TEMPLATE = "";
    }

    @Override
    public void call() {

        logger.info("Begin prediction.");

        logger.info("Finish prediction.");
    }
}
