package za.co.yellowfire.carat.jsf.component.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.ComponentHandler;

/**
 * Base class for all TagHandlers
 * @author Deluan Quintao
 */
public abstract class SecureTagHandler extends ComponentHandler {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    public SecureTagHandler(ComponentConfig config) {
        super(config);
    }

    protected Subject getSubject() {
        return SecurityUtils.getSubject();
    }

}