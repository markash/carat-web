package za.co.yellowfire.carat.jsf.component;

import org.richfaces.renderkit.RendererBase;

import javax.faces.application.ResourceDependencies;
import javax.faces.application.ResourceDependency;

@ResourceDependencies({
    @ResourceDependency(library = "javax.faces", name = "jsf.js"),
    @ResourceDependency(name = "jquery.js", target = "head"),
    @ResourceDependency(name = "richfaces.js", target = "head"),
    @ResourceDependency(name = "richfaces-event.js", target = "head"),
    @ResourceDependency(name = "richfaces-base-component.js", target = "head"),
    @ResourceDependency(name = "ui.core.js", target = "head"),
    @ResourceDependency(name = "ui.draggable.js", target = "head"),
    @ResourceDependency(name = "ui.resizable.js", target = "head"),
    @ResourceDependency(name = "fullcalendar.js", target = "head"),
    @ResourceDependency(name = "richfaces.schedule.js", target = "head"),
    @ResourceDependency(name = "fullcalendar.css", target = "head")})
public abstract class PieChartRendererBase extends RendererBase {
    public static final String RENDERER_TYPE = "za.co.yellowfire.carat.jsf.PieChartRenderer";
}