package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan({"com.controller"})//"com.interceptor"
/**
 * WebMvcConfigurer 主要是用来配置 监听器，拦截器等。
 */
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 视图处理器
     */
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/views/");
        return viewResolver;
    }

    /**
     * 日期格式
     * @param registry
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFormatter("yyy-MM-dd"));
    }

    /**
     * 拦截器
     * @param registry
     */


    /**
     * 静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ResourceHandlerRegistration resourceHandlerRegistration =
                registry.addResourceHandler("/static/**");
        resourceHandlerRegistration.addResourceLocations("classpath:/static/");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //相当于在某个控制器方法上的requestMapping值为/list上面添加@CrossOrigin注解
//        registry.addMapping("/add")
//                .allowedOrigins("http:127.0.0.1:8848")
       // .allowedMethods("GET","POST","OPTIONS");
        //地址是/**,表示所有的请求都配置了跨域
       // registry.addMapping("/**")
    }
}
