package cn.mobilemd;

import cn.mobilemd.resource.DemoResource;
import cn.mobilemd.resource.JsonContextProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        //3rd party packages
        register(JacksonFeature.class);
        register(JsonContextProvider.class);


        //this project classes
        register(DemoResource.class);
    }
}
