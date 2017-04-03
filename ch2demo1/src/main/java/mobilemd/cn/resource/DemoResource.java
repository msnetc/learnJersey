package mobilemd.cn.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jerry on 2017/4/3.
 */
@Path("hi")
public class DemoResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<String> hi(){
        List<String> result=new ArrayList<>();
        result.add("jerry");
        result.add("tom");
        return result;
    }

}
