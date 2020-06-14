package condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    @Bean
    public Person person(){
        return new Person();
    }

    @Conditional({WindowsCondition.class})
    @Bean("windows")
    public Person bill(){
        return new Person("Windows", 62);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linux")
    public Person linus(){
        return new Person("Linux", 77);
    }

}
