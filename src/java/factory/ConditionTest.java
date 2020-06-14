package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionTest {
    public static void main(String[] args) {
        /**
         * 使用Spring提供的 FactoryBean（工厂Bean）;
	 * 		1）、默认获取到的是工厂bean调用getObject创建的对象
       	    2）、要获取工厂Bean本身，我们需要给id前面加一个&
	 		&colorFactoryBean
                */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Object ob = applicationContext.getBean("colorFactoryBean");
        System.out.println(ob.getClass());

        Object ob2 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(ob2.getClass());
    }
}
