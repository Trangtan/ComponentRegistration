package importway;

import org.springframework.context.annotation.*;

@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegister.class})
public class MainConfig {
//    @Import[���ٸ������е���һ�����]
//          1����@Import(Ҫ���뵽�����е����)�������оͻ��Զ�ע����������idĬ����ȫ����
//	       	2����ImportSelector:������Ҫ����������ȫ�������飻
//        3����ImportBeanDefinitionRegistrar:�ֶ�ע��bean��������

}
