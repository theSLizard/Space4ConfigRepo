package configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/*
uplink.module-version=1
uplink.module-name= Agent Pods
uplink.instance-id= AgentPods
uplink.min-instances=2
uplink.log-resource=uplink-log
uplink.dependencies[0]= Universe
 */

@ConfigurationProperties(prefix = "uplink")
@ConfigurationPropertiesScan
public class UplinkConfigs {
    private String moduleVersion;
    private String moduleName;
    private String  instanceIdl;
    private Integer minInstances;
    private String logResource;
    private List<String> dependencies;

    public UplinkConfigs(String moduleVersion, String moduleName,
                         String instanceIdl, Integer minInstances,
                         String logResource, List<String> dependencies) {
        this.moduleVersion = moduleVersion;
        this.moduleName = moduleName;
        this.instanceIdl = instanceIdl;
        this.minInstances = minInstances;
        this.logResource = logResource;
        this.dependencies = dependencies;
    }

    public String getModuleVersion() {
        return moduleVersion;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getInstanceIdl() {
        return instanceIdl;
    }

    public Integer getMinInstances() {
        return minInstances;
    }

    public String getLogResource() {
        return logResource;
    }

    public List<String> getDependencies() {
        return dependencies;
    }
}
