package com.orderupdate.order.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.orderupdate.order.util.Constants;

@Configuration
public class AppConfig {
    
    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name(Constants.name).build();
    }
}
