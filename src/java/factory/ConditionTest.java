package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionTest {
    public static void main(String[] args) {
        /**
         * ʹ��Spring�ṩ�� FactoryBean������Bean��;
	 * 		1����Ĭ�ϻ�ȡ�����ǹ���bean����getObject�����Ķ���
       	    2����Ҫ��ȡ����Bean����������Ҫ��idǰ���һ��&
	 		&colorFactoryBean
                */
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Object ob = applicationContext.getBean("colorFactoryBean");
        System.out.println(ob.getClass());

        Object ob2 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(ob2.getClass());
    }
}
