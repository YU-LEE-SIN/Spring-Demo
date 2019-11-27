package config.simple;

import com.dao.UserInfoDao;
import com.dao.impl.UserInfoDaoImpl;
import com.service.UserInfoService;
import com.service.impl.UserInfoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleConfigIoc {
    @Bean
    public UserInfoDaoImpl userInfoDao(){
        return new UserInfoDaoImpl();
    }

    /**
     * 利用bean方法的参数来实现注入
     *
     * @param dao
     * @return
     */
    @Bean
    public UserInfoService userInfoService(UserInfoDao dao) {
        UserInfoServiceImpl userInfoService=new UserInfoServiceImpl();
        userInfoService.SetDao(dao);
        return userInfoService;
    }
}
