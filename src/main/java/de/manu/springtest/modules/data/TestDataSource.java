package de.manu.springtest.modules.data;

import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Used to test DI with constructors, custom events
 */
public class TestDataSource implements ApplicationEventPublisherAware {

    @Setter
    private transient ApplicationEventPublisher applicationEventPublisher;

    public void close() {
        LoggerFactory.getLogger(TestDataSource.class).info("TestDataSource closing");
    }

    public void init() {
        LoggerFactory.getLogger(TestDataSource.class).info("TestDataSource was created. A datasource-connect-event will be published.");
        var dataSourceConnectEvent = new DataSourceConnectEvent(this);
        this.applicationEventPublisher.publishEvent(dataSourceConnectEvent);
    }

}
