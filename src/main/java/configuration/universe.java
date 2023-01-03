package configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
universe.module-version=1
universe.module-name= Space4 World
universe.instance-id= Universe
universe.min-instances=1
universe.max-instances=1
universe.log-resource=universe-log
 */

@Configuration
@ConfigurationProperties(prefix = "universe")
public class universe {
}
