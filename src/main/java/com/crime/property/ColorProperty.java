package com.crime.property;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/14.
 */

@Service
@PropertySource("classpath:color.properties")
public class ColorProperty {

    @Getter
    @Value("${year}")
    private String yearColor;

    @Getter
    @Value("${quarter}")
    private String quarterColor;

    @Getter
    @Value("${month}")
    private String monthColor;

    @Getter
    @Value("${state}")
    private String stateColor;
}
