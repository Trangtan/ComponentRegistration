package importway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beans = applicationContext.getBeanDefinitionNames();
        for (String name : beans){
            System.out.println(name);
        }
    }
}
