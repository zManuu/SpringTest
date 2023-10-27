package de.manu.springtest.modules.server;

import de.manu.springtest.modules.Configuration;
import de.manu.springtest.modules.player.Player;
import lombok.Setter;
import org.slf4j.Logger;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

import java.text.MessageFormat;
import java.util.Set;

/**
 * Used to test DI with setters, bean-name-aware, resource-loader-aware
 */
@Setter
public class ServerData implements BeanNameAware, ResourceLoaderAware {

    private transient ResourceLoader resourceLoader;
    private transient Logger logger;
    private Configuration.Version version;
    private Set<Player> onlinePlayers;
    private String beanName;

    public void init() {
        var resource = resourceLoader.getResource("properties/version.properties");
        this.logger.info("ServerData was created. Testing the resource-loader. resource-file-name=" + resource.getFilename());
    }

}
