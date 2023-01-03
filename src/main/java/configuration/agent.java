package configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
agent.module-version=1
agent.module-name= Agent Handler
agent.instance-id= AgentHandler
agent.min-instances=1
agent.log-resource=agent-log
agent.dependencies[0]= Universe
 */

@Configuration
@ConfigurationProperties(prefix = "agent")
public class agent {
}
