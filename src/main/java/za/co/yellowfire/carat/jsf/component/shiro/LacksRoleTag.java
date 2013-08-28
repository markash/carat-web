package za.co.yellowfire.carat.jsf.component.shiro;

import javax.faces.view.facelets.ComponentConfig;

/**
 * @author Deluan Quintao
 */
public class LacksRoleTag extends PermissionTagHandler {

    // TODO - complete JavaDoc

    public LacksRoleTag(ComponentConfig config) {
        super(config);
    }

    @Override
    protected boolean showTagBody(String roleName) {
        boolean hasRole = getSubject() != null && getSubject().hasRole(roleName);
        return !hasRole;
    }

}