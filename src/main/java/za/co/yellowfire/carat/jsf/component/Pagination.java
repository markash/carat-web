package za.co.yellowfire.carat.jsf.component;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("za.co.yellowfire.carat.jsf.component.Pagination")
public class Pagination extends UINamingContainer {

    enum PropertyKeys {
        lastRendered,
        firstRendered,
        bean;

        String toString;
        PropertyKeys(String toString) { this.toString = toString; }
        PropertyKeys() { }
        public String toString() {
            return ((toString != null) ? toString : super.toString());
        }
    }

    /**
     * <p>Return the value of the <code>firstRendered</code> property.</p>
     */
    public Boolean getFirstRendered() {
        return (Boolean) getStateHelper().eval(PropertyKeys.firstRendered);
    }

    /**
     * <p>Set the value of the <code>firstRendered</code> property.</p>
     */
    public void setFirstRendered(Boolean _firstRendered) {
        getStateHelper().put(PropertyKeys.firstRendered, _firstRendered);
    }

    /**
     * <p>Return the value of the <code>lastRendered</code> property.</p>
     */
    public Boolean getLastRendered() {
        return (Boolean) getStateHelper().eval(PropertyKeys.lastRendered);
    }

    /**
     * <p>Set the value of the <code>lastRendered</code> property.</p>
     */
    public void setLastRendered(Boolean _lastRendered) {
        getStateHelper().put(PropertyKeys.lastRendered, _lastRendered);
    }

    /**
     * <p>Return the value of the <code>label</code> property.</p>
     * for this component.
     */
    public za.co.yellowfire.carat.web.MemoryPageableDataModel getBean() {
        return (za.co.yellowfire.carat.web.MemoryPageableDataModel) getStateHelper().eval(PropertyKeys.bean);

    }

    /**
     * <p>Set the value of the <code>label</code> property.</p>
     */
    public void setLabel(za.co.yellowfire.carat.web.MemoryPageableDataModel bean) {
        getStateHelper().put(PropertyKeys.bean, bean);
    }
}
