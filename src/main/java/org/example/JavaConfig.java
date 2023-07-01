package org.example;

import org.example.DevProfile;
import org.example.ProductionProfile;
import org.example.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(name = "example.profile.dev", havingValue = "false")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(name = "example.profile.dev", havingValue = "true")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
