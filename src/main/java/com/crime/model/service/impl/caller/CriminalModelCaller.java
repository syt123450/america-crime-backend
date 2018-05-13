package com.crime.model.service.impl.caller;

import com.crime.model.bean.CriminalRequest;
import com.crime.model.domain.Position;
import com.crime.property.PathProperty;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/13.
 */

@Component
public class CriminalModelCaller {

    private static final String SCRIPT_RAW = "python %s" +
            " --task_id=2" +
            " --month=%s" +
            " --day=%s" +
            " --state=%s" +
            " --longitude=%s" +
            " --latitude=%s" +
            " --n_killed=%s" +
            " --n_injured=%s";
    private static String SCRIPT_TEMPLATE;

    private static Logger logger = Logger.getLogger(CriminalModelCaller.class);

    @Autowired
    public void initTemplate(PathProperty pathProperty) {
        SCRIPT_TEMPLATE = String.format(SCRIPT_RAW, pathProperty.getCriminalPredictDir(),
                "%d", "%d", "%s", "%f", "%f", "%d", "%d");
    }

    public void call(CriminalRequest criminalRequest, Position position) {

        logger.info("Begin prediction.");

        String predictScript = String.format(SCRIPT_TEMPLATE, criminalRequest.getMonth(),
                criminalRequest.getDay(),
                criminalRequest.getState(),
                position.getLng(),
                position.getLat(),
                criminalRequest.getKilled(),
                criminalRequest.getInjured());

        try {
            Process ps = Runtime.getRuntime().exec(predictScript);
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("Finish prediction.");

    }
}
