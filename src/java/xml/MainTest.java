package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/bean.xml");
         Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);
    }
}
