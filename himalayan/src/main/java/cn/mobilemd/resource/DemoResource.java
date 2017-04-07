package cn.mobilemd.resource;

import cn.mobilemd.dao.TestDao;
import cn.mobilemd.domain.TestPOJO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("hi")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class DemoResource {

    private static final Logger LOGGER = Logger.getLogger(DemoResource.class);

    @Autowired
    private TestDao testDao;

    @GET
    public List<String> show(){
        List<String> ret=new ArrayList<>();
        ret.add("hello");
        ret.add("world");
        return ret;
    }

    @POST
    @Path("/dao")
    public List<TestPOJO> showDao(int age){
        DemoResource.LOGGER.error("coming");
        List<TestPOJO> ret= testDao.get(age);
        return ret;
    }

}
