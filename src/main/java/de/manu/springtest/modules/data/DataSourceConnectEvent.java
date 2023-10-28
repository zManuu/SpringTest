package de.manu.springtest.modules.data;

import org.springframework.context.ApplicationEvent;

public class DataSourceConnectEvent extends ApplicationEvent {

    public DataSourceConnectEvent(Object source) {
        super(source);
    }

}
