package importway;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    /**
     * AnnotationMetadata����ǰ���ע����Ϣ
     * BeanDefinitionRegistry:BeanDefinitionע���ࣻ
     * ��������Ҫ��ӵ������е�bean������
     * BeanDefinitionRegistry.registerBeanDefinition�ֹ�ע�����
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean definition = registry.containsBeanDefinition("importway.Red");
        boolean definition2 = registry.containsBeanDefinition("importway.Blue");
        if (definition && definition2) {
            //ָ��Bean������Ϣ����Bean�����ͣ�Bean��������
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Rainbow.class);
            //ע��һ��Bean��ָ��bean��
            registry.registerBeanDefinition("rainbow", beanDefinition);
        }
    }
}
