package de.manu.springtest.modules.data;

import lombok.Setter;
import org.slf4j.Logger;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Used to test DI with constructors, custom events
 */
public class TestDataSource implements ApplicationEventPublisherAware {

    @Setter
    private transient ApplicationEventPublisher applicationEventPublisher;
    private final transient Logger logger;

    public TestDataSource(Logger logger) {
        this.logger = logger;
    }

    public void close() {
        this.logger.info("TestDataSource closing");
    }

    public void init() {
        this.logger.info("TestDataSource was created. A datasource-connect-event will be published.");
        var dataSourceConnectEvent = new DataSourceConnectEvent(this);
        this.applicationEventPublisher.publishEvent(dataSourceConnectEvent);
    }

}
