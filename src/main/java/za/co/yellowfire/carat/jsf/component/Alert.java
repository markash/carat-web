package za.co.yellowfire.carat.jsf.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("za.co.yellowfire.carat.jsf.component.Alert")
public class Alert extends UINamingContainer {

    enum PropertyKeys {
        type,
        message
    }

    public String getMessage() {
        return (String) getStateHelper().eval(PropertyKeys.message);
    }

    public void setMessage(String message) {
        getStateHelper().put(PropertyKeys.message, message);
    }

    public String getType() {
        return (String) getStateHelper().eval(PropertyKeys.type);
    }

    public void setType(String type) {
        getStateHelper().put(PropertyKeys.type, type);
    }

    public String getAlertStyle() {
        final String type = getType();
        if (type == null) {
            return "alert-info";
        }

        if (type.equalsIgnoreCase("sucess")) {
            return "alert-success";
        } else if (type.equalsIgnoreCase("info")) {
            return "alert-info";
        } else if (type.equalsIgnoreCase("warning")) {
            return "alert-warning";
        } else if (type.equalsIgnoreCase("danger")) {
            return "alert-danger";
        }

        return "alert-info";
    }
}
