package importway;

import org.springframework.context.annotation.*;

@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegister.class})
public class MainConfig {
//    @Import[快速给容器中导入一个组件]
//          1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
//	       	2）、ImportSelector:返回需要导入的组件的全类名数组；
//        3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中

}
