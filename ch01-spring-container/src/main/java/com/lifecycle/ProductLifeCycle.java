package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProductLifeCycle implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性设置完毕之后after properties set : init ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("execute-destroy---");
    }
}
