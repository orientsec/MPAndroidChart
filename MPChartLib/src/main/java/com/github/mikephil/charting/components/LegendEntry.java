package com.github.mikephil.charting.components;


import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.support.annotation.ColorInt;

import com.github.mikephil.charting.utils.ColorTemplate;

public class LegendEntry {
    public LegendEntry() {

    }

    /**
     * @param label              The legend entry text. A `null` label will start a group.
     * @param form               The form to draw for this entry.
     * @param formSize           Set to NaN to use the legend's default.
     * @param formLineWidth      Set to NaN to use the legend's default.
     * @param formLineDashEffect Set to nil to use the legend's default.
     * @param formColor          The color for drawing the form.
     */
    public LegendEntry(String label,
                       Legend.LegendForm form,
                       float formSize,
                       float formLineWidth,
                       DashPathEffect formLineDashEffect,
                       int formColor) {
        this(label, Color.TRANSPARENT, form, formSize, formLineWidth, formLineDashEffect, formColor);
    }

    /**
     * @param label              The legend entry text. A `null` label will start a group.
     * @param labelColor         the text color to use for the labels,if set Color.TRANSPARENT the label will use legend's mTextColor
     * @param form               The form to draw for this entry.
     * @param formSize           Set to NaN to use the legend's default.
     * @param formLineWidth      Set to NaN to use the legend's default.
     * @param formLineDashEffect Set to nil to use the legend's default.
     * @param formColor          The color for drawing the form.
     */
    public LegendEntry(String label,
                       int labelColor,
                       Legend.LegendForm form,
                       float formSize,
                       float formLineWidth,
                       DashPathEffect formLineDashEffect,
                       int formColor) {
        this.label = label;
        this.labelColor = labelColor;
        this.form = form;
        this.formSize = formSize;
        this.formLineWidth = formLineWidth;
        this.formLineDashEffect = formLineDashEffect;
        this.formColor = formColor;
    }

    /**
     * @param label      The legend entry text. A `null` label will start a group.
     * @param labelColor the text color to use for the labels,if set Color.TRANSPARENT the label will use legend's mTextColor
     */
    public LegendEntry(String label, int labelColor) {
        this.label = label;
        this.labelColor = labelColor;
    }

    /**
     * The legend entry text.
     * A `null` label will start a group.
     */
    public String label;

    /**
     * the text color to use for the labels
     */
    @ColorInt
    public int labelColor = Color.TRANSPARENT;

    /**
     * The form to draw for this entry.
     * <p>
     * `NONE` will avoid drawing a form, and any related space.
     * `EMPTY` will avoid drawing a form, but keep its space.
     * `DEFAULT` will use the Legend's default.
     */
    public Legend.LegendForm form = Legend.LegendForm.DEFAULT;

    /**
     * Form size will be considered except for when .None is used
     * <p>
     * Set as NaN to use the legend's default
     */
    public float formSize = Float.NaN;

    /**
     * Line width used for shapes that consist of lines.
     * <p>
     * Set as NaN to use the legend's default
     */
    public float formLineWidth = Float.NaN;

    /**
     * Line dash path effect used for shapes that consist of lines.
     * <p>
     * Set to null to use the legend's default
     */
    public DashPathEffect formLineDashEffect = null;

    /**
     * The color for drawing the form
     */
    public int formColor = ColorTemplate.COLOR_NONE;

}