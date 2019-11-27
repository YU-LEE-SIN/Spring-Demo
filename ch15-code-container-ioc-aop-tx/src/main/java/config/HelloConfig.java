package config;

import com.dao.UserInfoDao;
import com.dao.impl.UserInfoDaoImpl;
import com.service.impl.UserInfoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
    /**
     * 加了Bean注解的方式,其作用是用来往spring中注册bean的
     *  没有指定Scope,默认就是单例
     *
     *  bean方法,如果放在@Configuration修饰的类中,那么此类会被动态代理
     *  也就是说bean方法已经被动态代理了.
     *  代理之后的方法的运行逻辑是这样:
     *  1.检查当前spring容器中有没有这个bean已经注册,
     *  没有就调用这个bean方法,有就直接返回,什么都不干.
     * @return
     */
    @Bean
    public UserInfoDaoImpl userInfoDao(){
        return new UserInfoDaoImpl();
    }

    @Bean
    public UserInfoServiceImpl userInfoService(UserInfoDao dao) {
        UserInfoServiceImpl service = new UserInfoServiceImpl();
        service.SetDao(dao);
        return service;
    }
}
