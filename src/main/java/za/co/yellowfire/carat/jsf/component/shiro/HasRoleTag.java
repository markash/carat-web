package za.co.yellowfire.carat.jsf.component.shiro;

import javax.faces.view.facelets.ComponentConfig;

/**
 * @author Deluan Quintao
 */
public class HasRoleTag extends PermissionTagHandler {

    // TODO - complete JavaDoc

    public HasRoleTag(ComponentConfig config) {
        super(config);
    }

    @Override
    protected boolean showTagBody(String roleName) {
        return getSubject() != null && getSubject().hasRole(roleName);
    }

}
