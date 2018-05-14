package com.crime.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ss on 2018/5/14.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateTotal {

    private String State;
    private int total;
}
