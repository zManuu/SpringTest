package de.manu.springtest.modules.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DataSourceConfig {

    private String host;
    private int port;
    private String userName;
    private String userPassword;
    private String databaseName;

}
