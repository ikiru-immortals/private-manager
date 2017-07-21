package cn.com.immortals.endpoint;

import cn.com.aoaodou.model.Pageable;
import cn.com.immortals.model.model.UserBO;
import cn.com.immortals.model.response.RestResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Immortals.
 * @version 1.0.0
 */
@Path("/b/user")
public interface UserEndpoint {

    @GET()
    @Path(("/userList.json"))
    RestResponse listUser(Pageable pageable, UserBO userBO);

}
