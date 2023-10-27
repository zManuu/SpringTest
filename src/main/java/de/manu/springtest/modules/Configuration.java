package de.manu.springtest.modules;

/**
 * Holds configuration records. Note: InteliJ can't handle usages of records in bean definitions.
 */
public class Configuration {

    public record Format(String dateTime, String date, String time, String loggingInstantiation) {}
    public record Version(String version, String name) {}
    public record Datasource(String host, int port, String userName, String password, String databaseName) {}

}
