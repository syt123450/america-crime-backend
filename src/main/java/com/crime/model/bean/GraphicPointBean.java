package com.crime.model.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ss on 2018/5/13.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GraphicPointBean {

    private String x;
    private int y;

    public GraphicPointBean(String x) {
        this.x = x;
    }
}
