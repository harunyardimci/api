package com.harun.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.harun.core.domain.User;
import com.harun.core.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService
{

    private List<User> users = new ArrayList<User>();
    
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    
    @Override
    public List<User> loadUsers()
    {
        logger.info("{} users found", users.size());
        return users;
    }

    @Override
    public User getUser(int userId)
    {
        logger.info("User requested with id: {}", userId);
        return null;
    }

    @Override
    public boolean save()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean delete()
    {
        // TODO Auto-generated method stub
        return false;
    }
}
