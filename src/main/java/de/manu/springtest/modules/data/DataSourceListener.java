package de.manu.springtest.modules.data;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

public class DataSourceListener implements ApplicationListener<DataSourceConnectEvent> {

    @Override
    public void onApplicationEvent(DataSourceConnectEvent event) {
        LoggerFactory.getLogger(DataSourceListener.class).info("A datasource-connect-event was captured by the datasource-listener.");
    }
}
