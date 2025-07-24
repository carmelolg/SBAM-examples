package it.carmelolagamba.sbam.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import java.util.Map;

@ConfigurationProperties(prefix = "integration.jsonplaceholder")
@Getter @Setter
public class JsonPlaceholderProperties {
    private String baseUrl;
    private int defaultTimeout;
    private MultiValueMap<String, String> defaultHeaders;
}
