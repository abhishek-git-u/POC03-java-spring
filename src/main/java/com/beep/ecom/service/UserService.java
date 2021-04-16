package com.beep.ecom.service;


import java.util.Collection;

import com.beep.ecom.entity.User;

public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
