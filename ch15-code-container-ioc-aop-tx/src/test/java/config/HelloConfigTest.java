package config;

import com.service.impl.UserInfoServiceImpl;
import config.ann.AnnoSupportTxConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class HelloConfigTest {

    @Test
    public void userInfoService() {
        ApplicationContext context =new AnnotationConfigApplicationContext(HelloConfig.class);
        UserInfoServiceImpl service = context.getBean(UserInfoServiceImpl.class);
        service.update();
    }
}