package condition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class ConditionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] nameForType = applicationContext.getBeanNamesForType(Person.class);

        ConfigurableEnvironment environment = (ConfigurableEnvironment) applicationContext.getEnvironment();

//        String property = environment.getProperty("os.name");
//
//        System.out.println(property);

        for (String name : nameForType){
            System.out.println(name);
        }
    }
}
