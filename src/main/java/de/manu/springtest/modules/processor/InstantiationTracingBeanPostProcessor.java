package de.manu.springtest.modules.processor;

import com.google.gson.Gson;
import de.manu.springtest.modules.Configuration;
import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.text.MessageFormat;

@AllArgsConstructor
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    private final transient Gson gson;
    private final Configuration.Format formatConfig;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LoggerFactory.getLogger(InstantiationTracingBeanPostProcessor.class).info(
                MessageFormat.format(
                        this.formatConfig.loggingInstantiation(),
                        bean.getClass().getName(),
                        bean.getClass().getSimpleName(),
                        beanName,
                        this.gson.toJson(bean)
                )
        );
        return bean;
    }
}
