package com.crime.model.bean;

import lombok.Data;

import java.util.List;

/**
 * Created by ss on 2018/5/13.
 */

@Data
public class ComboData {

    private List<GraphicPointBean> top1Killed;
    private List<GraphicPointBean> top1Injured;
    private List<GraphicPointBean> top2Killed;
    private List<GraphicPointBean> top2Injured;
    private List<GraphicPointBean> top3Killed;
    private List<GraphicPointBean> top3Injured;
    private List<GraphicPointBean> average;
}
