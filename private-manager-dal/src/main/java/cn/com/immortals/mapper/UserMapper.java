package cn.com.immortals.mapper;

import cn.com.immortals.model.UserDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author panzhuowen
 * @version 1.0.0
 */
@Repository
public interface UserMapper {
    
    List<UserDO> getUserListPage(UserDO userDO);
    
}
