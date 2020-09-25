package com.example.algorithm.Spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/24 下午8:48
 */
@Component(value = "Singe")
public class User  implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
