package cn.com.immortals.impl;

import cn.com.aoaodou.interceptor.PageableInterceptor;
import cn.com.aoaodou.model.Pageable;
import cn.com.immortals.UserBizService;
import cn.com.immortals.dal.UserDao;
import cn.com.immortals.model.model.UserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Immortals.
 * @version 1.0.0
 */
@Service
public class UserBizServiceImpl implements UserBizService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<UserBO> listUser(Pageable pageable, UserBO userBO) {
        PageableInterceptor.startPage(pageable);
        return userDao.listUser(userBO);
    }
}
