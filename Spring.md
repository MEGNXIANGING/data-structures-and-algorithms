### bean的生命周期
    1、bean容器找到配置文件的spring bean的定义,   beanDefinition
    2、bean容器利用java reflection APi创建了一个bean的实例
    3、如果涉及到一些属性值，通过set设置一些属性值
    4、实现aware接口，调用实现的方法
    5、初始化，实现了InitializingBean，设置其属性
    6、如果是单例的bean的话，放入单例池中
