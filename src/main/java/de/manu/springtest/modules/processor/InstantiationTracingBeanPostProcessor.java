package de.manu.springtest.modules.processor;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.text.MessageFormat;

@AllArgsConstructor
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    private final transient Gson gson;
    private final transient Logger logger;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        this.logger.info(
                MessageFormat.format(
                        "A bean of type \"{0}\" with name \"{1}\" was created: {2}",
                        bean.getClass().getName(),
                        beanName,
                        gson.toJson(bean)
                )
        );
        return bean;
    }
}
