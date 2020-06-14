package componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] lists = applicationContext.getBeanDefinitionNames();
        for (String item : lists){
            System.out.println(item);
        }
    }
}
