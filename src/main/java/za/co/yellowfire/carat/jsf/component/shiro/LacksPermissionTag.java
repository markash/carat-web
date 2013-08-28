package za.co.yellowfire.carat.jsf.component.shiro;

import javax.faces.view.facelets.ComponentConfig;

/**
 * @author Deluan Quintao
 */
public class LacksPermissionTag extends PermissionTagHandler {

    // TODO - complete JavaDoc

    public LacksPermissionTag(ComponentConfig config) {
        super(config);
    }

    protected boolean showTagBody(String p) {
        return !isPermitted(p);
    }

}
