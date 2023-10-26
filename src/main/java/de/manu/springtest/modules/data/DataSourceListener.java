package de.manu.springtest.modules.data;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.springframework.context.ApplicationListener;

@AllArgsConstructor
public class DataSourceListener implements ApplicationListener<DataSourceConnectEvent> {

    private final transient Logger logger;

    @Override
    public void onApplicationEvent(DataSourceConnectEvent event) {
        this.logger.info("A datasource-connect-event was captured by the datasource-listener.");
    }
}
