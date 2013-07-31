package za.co.yellowfire.carat.jsf.component;

import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;

import javax.faces.component.UIComponentBase;

@JsfComponent(
        type = "za.co.yellowfire.carat.jsf.Hello",
        family = "za.co.yellowfire.carat.text",
        renderer = @JsfRenderer(type = "za.co.yellowfire.carat.jsf.hello"),
        tag = @Tag(name = "hello")
)
public abstract class AbstractHello extends UIComponentBase {
}
