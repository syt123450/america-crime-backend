package com.crime.model.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ss on 2018/5/12.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CriminalInfo {

    private int suspect;
    private int arrested;
    private int victim;
}
