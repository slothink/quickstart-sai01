package world.sai.misc.quickstart.sai01.web.bootstrap;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import world.sai.misc.quickstart.sai01.core.config.AppConfig;
import world.sai.misc.quickstart.sai01.web.config.WebConfig;

/**
 * Created by sai on 15. 9. 25..
 */
public class SpringRootContextListener extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() { return new Class[] {AppConfig.class};}

    protected Class<?>[] getServletConfigClasses()  { return new Class[] {WebConfig.class};}

    protected String[] getServletMappings() {
        return new String[] {"*.do"};
    }
}
