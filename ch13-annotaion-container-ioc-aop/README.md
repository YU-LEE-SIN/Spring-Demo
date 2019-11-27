# 容器
1.xml:compent-scan
2 Controller,Service,Repository,Componet
3.PostConstruct,PreDestroy
4.Scope

# IOC
Autowire
    注意List与Map的注入.
Resource
Inject

    多个候选的解决办法
    @Primary
    @Qulifier
# AOP
1.aspectj-autoproxy.相当于让spring理解aop相关的注解
    proxy-target-class属性的作用
    默认情况,spring生成动态代理,会考虑被代理对象是否实现有接口
    如果有,就利用jdk的动态代理技术来做,生成的代理类,不是目标类型的子类。
    =true 时spring不管有没有实现接口,都统一用cglib子类的形式来创建动态代理类
2. Aspect 切面

3.通知:
    @Before
    @After
    @AfterReturning
    @AfterThrowing
    @Around
4 切点表达式
    方法是无参无返回值
  # 读取外部属性文件
  利用PropertySource注解读取外部文件到Environment
  
  使用外部文件的数据,方法有2种
  1.利用Environment.getProperty
  2.利用Value注解
    
    @Pointcut
    
 1.作业:Autowired与Resource的区别,    @Autowired byType @Resource byName
 @Resource是Java自己的注解，@Resource有两个属性是比较重要的，
 分是name和type；Spring将@Resource注解的name属性解析为bean的名字，
 而type属性则解析为bean的类型。所以如果使用name属性，
 则使用byName的自动注入策略，而使用type属性时则使用byType自动注入策略。
 如果既不指定name也不指定type属性，这时将通过反射机制使用byName自动注入策略。
 
 @Autowired是spring的注解，是spring2.5版本引入的，
 Autowired只根据type进行注入，不会去匹配name。如果涉及到type无法辨别注入对象时，
 那需要依赖@Qualifier或@Primary注解一起来修饰
 
 2.添加4个注解时,默认bean的名字是什么?如何改变
    默认是类的名字，首字母小写
    @service("这里写名字")
 3.做好笔记
 
 4 @Value注解除了修饰在字段上,还可以修饰在哪里?
 ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE
field 字段 ，method 方法，  parameter 参数 ，annotation_type 注解类型
 
 5.Autowired注解的required属性是什么意思?
 required=true表示注入的时候，该bean必须存在，否则就会注入失败。
 Autowired(required=false)：表示忽略当前要注入的bean，如果有直接注入，没有跳过，不会报错。
 
 6.Autowired注解可以修饰在哪里?
 ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE
 
 7.怎么读取多个外部属性文件
 
 