package za.co.yellowfire.carat.jsf.component.shiro;

import javax.faces.view.facelets.ComponentConfig;

/**
 * Tag that renders the tag body only if the current user has the string permissions
 * specified in <tt>name</tt> attribute.
 *
 * @author Deluan Quintao
 */
public class HasPermissionTag extends PermissionTagHandler {

    public HasPermissionTag(ComponentConfig config) {
        super(config);
    }

    protected boolean showTagBody(String p) {
        return isPermitted(p);
    }
}