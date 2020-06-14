package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    @Bean("customName")
    public Person person(){
        return new Person();
    }
}
