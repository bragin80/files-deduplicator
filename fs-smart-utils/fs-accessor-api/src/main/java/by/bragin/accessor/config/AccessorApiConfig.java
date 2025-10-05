package by.bragin.accessor.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.EnableFeignClients;

@ConditionalOnProperty(prefix = "feign", name="fs-accessor-api")
@EnableFeignClients
public class AccessorApiConfig {
}
