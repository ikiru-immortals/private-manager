package cn.com.immortals;

import cn.com.aoaodou.model.Pageable;
import cn.com.immortals.model.model.UserBO;

import java.util.List;

/**
 * @author Immortals.
 * @version 1.0.0
 */
public interface UserBizService {

    List<UserBO> listUser(Pageable pageable, UserBO userBO);

}
