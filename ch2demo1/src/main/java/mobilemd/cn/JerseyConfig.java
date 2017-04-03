package mobilemd.cn;

import mobilemd.cn.resource.DemoResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by jerry on 2017/4/3.
 */
@Component
public class JerseyConfig  extends ResourceConfig{
    public JerseyConfig() {
            register(DemoResource.class);
    }

}
