package com.harun.core.service;

import java.util.List;

import com.harun.core.domain.User;

/**
 * @author harun
 *
 */
public interface UserService
{

    List<User> loadUsers();
    
    User getUser(int userId);
    
    boolean save();
    
    boolean delete();
}
