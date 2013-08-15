package za.co.yellowfire.carat.jsf.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("za.co.yellowfire.carat.jsf.component.JumboTron")
public class JumboTron extends UINamingContainer {

    enum PropertyKeys {
        heading,
        tagline
    }

    /**
     * <p>Return the value of the <code>heading</code> property.</p>
     */
    public String getHeading() {
        return (String) getStateHelper().eval(PropertyKeys.heading);
    }

    /**
     * <p>Set the value of the <code>heading</code> property.</p>
     */
    public void setHeading(String heading) {
        getStateHelper().put(PropertyKeys.heading, heading);
    }

    /**
     * <p>Return the value of the <code>tagLine</code> property.</p>
     */
    public String getTagline() {
        return (String) getStateHelper().eval(PropertyKeys.tagline);
    }

    /**
     * <p>Set the value of the <code>tagLine</code> property.</p>
     */
    public void setTagline(String tagline) {
        getStateHelper().put(PropertyKeys.tagline, tagline);
    }
}
