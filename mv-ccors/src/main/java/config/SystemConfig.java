package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SystemConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    /**
     * 当你的项目只有一个spring 容器,那么只需要下面方法返回有值即可
     *
     * 如果有2个容器,那么这2个配置类的方法都需要返回配置类
     * @return
     *
     * 这个是父容器
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    /**
     *  * 这个是子容器
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
