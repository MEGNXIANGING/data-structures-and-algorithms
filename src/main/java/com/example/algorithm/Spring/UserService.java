package com.example.algorithm.Spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/24 下午8:48
 */
@Component
public class UserService implements BeanNameAware, BeanFactoryAware , ApplicationContextAware {
    @Autowired
    private  User user;

    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName=s;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
