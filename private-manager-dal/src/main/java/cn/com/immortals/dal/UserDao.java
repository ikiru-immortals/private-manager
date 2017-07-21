package cn.com.immortals.dal;

import cn.com.immortals.model.model.UserBO;

import java.util.List;

/**
 * @author Immortals.
 * @version 1.0.0
 */
public interface UserDao {

    List<UserBO> listUser(UserBO userBO);

}
