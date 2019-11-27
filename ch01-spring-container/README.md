1. HelloWorld
    maven依赖
    xml配置文件
    ApplicationContext的创建
    getBean的2种用法
    
2  工厂
    工厂类的静态方法
    工厂类的实例方法
    FactoryBean
3 作用域
    prototype
    singleton
    request
    session
    作用域的设置
    对象的创建时机
4  对象的初始化方法与销毁方法
    bean
    beans
    InitializingBean,DisposableBean

5  aware接口
    ApplicationContextAware
    BeanNameAware
    
作业:
1.百度找出BeanFactory与ApplicationContext的不同


2.spring-core,spring-beans,spring-web各个
依赖里面大致有哪些功能?
Spring web：包含Web应用开发时，用到Spring框架时所需的核心类，
包括自动载入WebApplicationContext特性的类、
Struts与JSF集成类、文件上传的支持类、Filter类和大量工具辅助类
Spring Core：Spring的核心工具包
Spring Beans：Spring IOC的基础实现，包含访问配置文件、创建和管理bean等。

3.把案例中AFactory类的createB
方法的代码改为return new A();
请问这种方式A的作用域是单例还是原型
根据bean的scop配置有个关
scope="singleton"就是单例

4.配置bean的时候,其lazy-init是什么意思?
<bean id="a" class"com.xx" lazy-init="true"/>
spring容器在初始化的时候不会初始化a这个bean,什么时候用到了该bean才会进行初始化
表示该bean在容器初始化的时候不进行初始化。

5.理解prototype作用域时,为什么销毁方法不生效?

prototype作用的bean是在每次getBean的时候都反复创建
bean的实例出来.
prototype作用域时，实例化容器时不会创建对象。
原型每次getBean的时创建一个对象，此对象不会被Spring引用，


自学内容(可选):
    学习案例中dynamic包下相关内容
  目标:
  1.能理解BeanDefinition
  2.能理解BeanDefinitionBuilder
  3.能了解BeanDefinitionRegistry
  4.理解动态注解的作用与使用场景 

