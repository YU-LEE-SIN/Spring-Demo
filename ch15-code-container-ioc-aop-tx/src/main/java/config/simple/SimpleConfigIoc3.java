package config.simple;

import com.dao.impl.UserInfoDaoImpl;
import com.service.UserInfoService;
import com.service.impl.UserInfoServiceImpl;
import org.springframework.context.annotation.Bean;

public class SimpleConfigIoc3 {
    @Bean
    public UserInfoDaoImpl userInfoDao() {
        return new UserInfoDaoImpl();
    }
    /**
     * 利用autowire来实现注入
     * 理论是Configuration修饰的类除了是个配置类,它本身也是一个被
     * spring管理的类,所以可以注入东西
     *
     */
    public UserInfoService userInfoService(){
        UserInfoServiceImpl userInfoService=new UserInfoServiceImpl();
        userInfoService.SetDao(userInfoDao());
        return userInfoService;
    }
}
