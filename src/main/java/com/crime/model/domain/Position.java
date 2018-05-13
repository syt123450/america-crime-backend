package com.crime.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ss on 2018/5/13.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Position {

    private double lat;
    private double lng;
}
