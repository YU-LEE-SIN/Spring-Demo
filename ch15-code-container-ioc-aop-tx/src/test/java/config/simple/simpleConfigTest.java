package config.simple;

import com.service.impl.UserInfoServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.java2d.pipe.SpanShapeRenderer;

import static org.junit.Assert.*;

public class simpleConfigTest {

    @Test
    public void userInfoService() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleConfig.class);
        UserInfoServiceImpl service = ctx.getBean(UserInfoServiceImpl.class);
        service.update();
    }
}