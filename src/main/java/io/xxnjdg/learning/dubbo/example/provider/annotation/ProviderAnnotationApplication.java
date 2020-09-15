package io.xxnjdg.learning.dubbo.example.provider.annotation;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 10:24
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "io.xxnjdg.learning.dubbo.example.provider.annotation")
public class ProviderAnnotationApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new
                SpringApplicationBuilder(ProviderAnnotationApplication.class);
        builder.application().setAdditionalProfiles("provider-annotation");
        builder.run(args);
    }
}