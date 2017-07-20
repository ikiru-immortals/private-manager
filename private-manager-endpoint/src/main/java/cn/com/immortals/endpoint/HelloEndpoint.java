package cn.com.immortals.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by panzh on 2017/7/12.
 */
@Path("/hello")
public interface HelloEndpoint {

    @GET
    String hello();

}
