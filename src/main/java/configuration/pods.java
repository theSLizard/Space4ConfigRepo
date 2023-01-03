package configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
pods.module-version=1
pods.module-name= Agent Pod Connectors
pods.instance-id= Endpoints
pods.min-instances=4
pods.log-resource=agent-pod-log
pods.dependencies[0]=AgentPods
pods.dependencies[1]=Universe
pods.dependencies[2]=Agenthandler
 */

@Configuration
@ConfigurationProperties(prefix = "pods")
public class pods {
}
