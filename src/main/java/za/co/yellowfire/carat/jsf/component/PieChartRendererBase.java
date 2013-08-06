package za.co.yellowfire.carat.jsf.component;

import org.ajax4jsf.javascript.JSObject;
import org.richfaces.renderkit.RendererBase;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import java.io.IOException;
import java.util.Locale;

@ResourceDependencies({
    @ResourceDependency(library = "javax.faces", name = "jsf.js"),
    @ResourceDependency(name = "jquery.js", target = "head"),
    @ResourceDependency(name = "jquery.flot.js", target = "head")
})
public abstract class PieChartRendererBase extends RendererBase {
    public static final String RENDERER_TYPE = "za.co.yellowfire.carat.jsf.PieChartRenderer";

    protected void writeInitFunction(FacesContext context, UIComponent component) throws IOException {
        AbstractPieChart chart = (AbstractPieChart) component;
        ResponseWriter writer = context.getResponseWriter();
        String clientId = chart.getClientId(context);
        Locale locale = context.getViewRoot().getLocale();
        String widgetVar = chart.getWidgetVar();
        if (widgetVar != null) {
            writer.writeText("var " + widgetVar + " = ", null);
        }
        writer.writeText(new JSObject("$.plot", clientId, "data", "options").toScript(), null);
    }
}