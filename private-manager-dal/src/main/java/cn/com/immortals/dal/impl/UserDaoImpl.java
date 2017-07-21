package cn.com.immortals.dal.impl;

import cn.com.immortals.dal.UserDao;
import cn.com.immortals.mapper.UserMapper;
import cn.com.immortals.model.model.UserBO;
import cn.com.immortals.model.UserDO;
import cn.com.immortals.model.convert.ModelConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Immortals.
 * @version 1.0.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;


    public List<UserBO> listUser(UserBO userBO) {
        ModelConvert<UserDO> doModelConvert = new ModelConvert<>();
        UserDO userDO = doModelConvert.convert(userBO, UserDO.class);
        List<UserDO> userDOList = userMapper.getUserListPage(userDO);
        List<UserBO> boList = new ArrayList<>();
        ModelConvert<UserBO> boModelConvert = new ModelConvert<>();
        for (UserDO temp : userDOList) {
            boList.add(boModelConvert.convert(temp, UserBO.class));
        }
        return boList;
    }
}
