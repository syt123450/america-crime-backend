package com.crime.model.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/5/14.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArcSeries {

    private String title;
    private String color;
    private Integer size;
    private List<ArcSeries> children;

    public ArcSeries(String title, String color) {
        this.title = title;
        this.color = color;
        this.size = null;
        this.children = new ArrayList<>();
    }

    public ArcSeries(String title, String color, int size) {
        this.title = title;
        this.color = color;
        this.size = size;
        this.children = new ArrayList<>();
    }
}
