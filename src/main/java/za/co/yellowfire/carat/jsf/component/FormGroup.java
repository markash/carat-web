package za.co.yellowfire.carat.jsf.component;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import javax.annotation.Nullable;
import javax.faces.application.FacesMessage;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponent;
import javax.faces.component.UINamingContainer;
import javax.validation.constraints.NotNull;

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

    public String getValidationStyle() {
        for(UIComponent child : getChildren()) {
            System.out.println("child id = " + child.getId() + ", clientId = " + child.getClientId());
        }

        System.out.println("Reading messages for clientId " + getFor());

        boolean hasError = hasMessages(getFor(), FacesMessage.SEVERITY_FATAL, FacesMessage.SEVERITY_ERROR);
        boolean hasWarning = hasMessages(getFor(), FacesMessage.SEVERITY_WARN);
//        boolean hasInfo = hasMessages(getFor(), FacesMessage.SEVERITY_INFO);

        if (hasError) {
            return "has-error";
        } else if (hasWarning) {
            return "has-warning";
        }
        return "";
    }

    protected boolean hasMessages(final String clientId, @NotNull final FacesMessage.Severity...severities) {
        return !Iterables.isEmpty(Iterables.filter(
                getFacesContext().getMessageList(clientId),
                new Predicate<FacesMessage>() {
                    @Override
                    public boolean apply(@Nullable FacesMessage msg) {
                        if (msg != null && msg.getSeverity() != null) {
                            for (FacesMessage.Severity severity : severities) {
                                if (severity.equals(msg.getSeverity())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }));
    }
}
