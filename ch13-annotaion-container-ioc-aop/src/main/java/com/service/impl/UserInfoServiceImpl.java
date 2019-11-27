package com.service.impl;

import com.dao.UserInfoDao;
import com.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Service  ，，注入容器中
 * @Scope("singleton") ，，作用域
 */
@Service
@Scope("singleton")
public class UserInfoServiceImpl implements UserInfoService {

    public UserInfoServiceImpl(UserInfoDao dao) {
        this.dao = dao;
    }
    /**
     * 在spring的注解方式实现注入的能力方面,支持3个注解
     * 1.Autowired
     * 2.Resource
     * 3.Inject
     * 后2个注解是java规范的注解,不属于spring的注解
     * Autowire属于spring创造的注解
     * 三个注解都可以用,只不过第三个注解用得很少
     *
     * Autowire默认先是依据类型来自动装配
     * 如果有多个,接着再用名字来找到一个.
     * Autowired注解可以用在:
     * 1.字段上
     * 2.方法上(setter方法)
     *
     *
     *  @Qualifier("userInfoDaoImpl") 相当于 UserService bean 的 id=userInfoDaoImpl。
     */

    //@Autowired
   // @Qualifier("userInfoDaoImpl")
    private UserInfoDao dao;

    @Override
    public void update() {
       // dao.update();
    }

    /**
     * 初始化
     *  @PostConstruct 相当于 init-method="init"
     */
    @PostConstruct
    public void init(){
        System.out.println("容器 init---");
    }

    /**
     * 销毁
     */
    @PreDestroy
    public void destory(){
        System.out.println("destory---");
    }

    //list这种方式是把所有被spring管理的这种类型的bean都注入进来
    @Autowired
    private List<UserInfoDao> userInfoDaoList;
    //map方式,1.它的类型必须是String作为key,因为其存放的是bean的名字
    @Autowired
    private Map<String, UserInfoDao> userInfoDaoMap;

    public void displayAutowireCollectionInject(){
        for (UserInfoDao infoDao : userInfoDaoList) {
            infoDao.update();
        }
        System.out.println("华丽的分割线下面是map");
        for (Map.Entry<String, UserInfoDao> entry : userInfoDaoMap.entrySet()) {
            System.out.println("key = " + entry.getKey() + "value"+entry.getValue());
        }
    }
}
