package com.crime.model.service.impl.caller;

import com.crime.model.bean.VictimsRequest;
import com.crime.model.domain.Position;
import com.crime.property.PathProperty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/13.
 */

@Component
public class VictimModelCaller {

    private static final String SCRIPT_RAW = "python %s" +
            " --task_id=1" +
            " --month=%s" +
            " --day=%s" +
            " --state=%s" +
            " --longitude=%s" +
            " --latitude=%s";
    private static String SCRIPT_TEMPLATE;

    private static Logger logger = Logger.getLogger(VictimModelCaller.class);

    @Autowired
    public void initTemplate(PathProperty pathProperty) {
        SCRIPT_TEMPLATE = String.format(SCRIPT_RAW, pathProperty.getVictimPredictDir(),
                "%d", "%d", "%s", "%f", "%f");
    }

    public void call(VictimsRequest victimsRequest, Position position) {

        logger.info("Begin prediction.");

        String predictScript = String.format(SCRIPT_TEMPLATE, victimsRequest.getMonth(),
                victimsRequest.getDay(),
                victimsRequest.getState(),
                position.getLng(),
                position.getLat());

        try {
            Process ps = Runtime.getRuntime().exec(predictScript);
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("Finish prediction.");
    }
}
