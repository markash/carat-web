package za.co.yellowfire.carat.jsf.component;

import javax.el.MethodExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("za.co.yellowfire.carat.jsf.component.MenuItem")
public class MenuItem extends UINamingContainer {

    enum PropertyKeys {
        value,
        action
    }

    public String getValue() {
        return (String) getStateHelper().eval(PropertyKeys.value);
    }

    public void setValue(String value) {
        getStateHelper().put(PropertyKeys.value, value);
    }

    public MethodExpression getAction() {
        return (MethodExpression) getStateHelper().eval(PropertyKeys.action);
    }

    public void setAction(MethodExpression action) {
        getStateHelper().put(PropertyKeys.action, action);
    }
}
