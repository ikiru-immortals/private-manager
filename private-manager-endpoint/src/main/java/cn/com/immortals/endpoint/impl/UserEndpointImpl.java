package cn.com.immortals.endpoint.impl;

import cn.com.aoaodou.model.Pageable;
import cn.com.immortals.UserBizService;
import cn.com.immortals.endpoint.UserEndpoint;
import cn.com.immortals.model.model.UserBO;
import cn.com.immortals.model.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Immortals.
 * @version 1.0.0
 */
@Service
public class UserEndpointImpl implements UserEndpoint {

    @Autowired
    private UserBizService userBizService;

    @Override
    public RestResponse listUser(Pageable pageable, UserBO userBO) {
        List<UserBO> userBOList = userBizService.listUser(pageable, userBO);
        RestResponse restResponse = new RestResponse();
        restResponse.setResponseCollection(userBOList);
        return restResponse;
    }
}
