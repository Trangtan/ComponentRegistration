package componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value="componentscan",includeFilters = {
//						@ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
//						@ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),
        @ComponentScan.Filter(type= FilterType.CUSTOM,classes={MyTypeFilter.class})
},useDefaultFilters = false
)
//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件 可以不加 useDefaultFilters = false
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件 必须加 useDefaultFilters = false 才生效
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

}
