package za.co.yellowfire.carat.jsf.component;

import org.richfaces.cdk.annotations.*;

import javax.faces.component.UIComponentBase;

@JsfComponent(tag = @Tag(name = "pieChart",
    type = TagType.Facelets),
    renderer = @JsfRenderer(family = AbstractPieChart.COMPONENT_FAMILY, type = PieChartRendererBase.RENDERER_TYPE)
)
public abstract class AbstractPieChart extends UIComponentBase {
    public static final String COMPONENT_FAMILY = "za.co.yellowfire.carat.chart";
    public static final String COMPONENT_TYPE = "za.co.yellowfire.carat.PieChart";

    @Attribute
    public abstract String getWidgetVar();
}