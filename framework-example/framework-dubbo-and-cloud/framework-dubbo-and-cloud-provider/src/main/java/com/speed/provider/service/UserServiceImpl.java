package com.speed.provider.service;

import com.speed.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author jasonbiao
 * @date 2020-05-06 18:18
 * Description: <p>
 *
 * </p>
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "jasonbiao1";
    }
}
