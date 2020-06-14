package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {

//        包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]

         ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
         Person person = (Person) applicationContext.getBean("customName");

        System.out.println(person);
    }
}
