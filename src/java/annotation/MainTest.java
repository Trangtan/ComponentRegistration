package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {

//        ��ɨ��+�����עע�⣨@Controller/@Service/@Repository/@Component��[�Լ�д����]

         ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
         Person person = (Person) applicationContext.getBean("customName");

        System.out.println(person);
    }
}
