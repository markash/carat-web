package za.co.yellowfire.carat.jsf.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("za.co.yellowfire.carat.jsf.component.FormGroup")
public class FormGroup extends UINamingContainer {

    enum PropertyKeys {
        forVal("for"),
        label;

        String toString;
        PropertyKeys(String toString) { this.toString = toString; }
        PropertyKeys() { }
        public String toString() {
            return ((toString != null) ? toString : super.toString());
        }
    }

    /**
     * <p>Return the value of the <code>for</code> property.</p>
     * <p>Contents: Client identifier of the component for which this element
     * is a label.
     */
    public java.lang.String getFor() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.forVal);

    }

    /**
     * <p>Set the value of the <code>for</code> property.</p>
     */
    public void setFor(java.lang.String _for) {
        getStateHelper().put(PropertyKeys.forVal, _for);
    }

    /**
     * <p>Return the value of the <code>label</code> property.</p>
     * for this component.
     */
    public java.lang.String getLabel() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.label);

    }

    /**
     * <p>Set the value of the <code>label</code> property.</p>
     */
    public void setLabel(java.lang.String label) {
        getStateHelper().put(PropertyKeys.label, label);
    }
}
