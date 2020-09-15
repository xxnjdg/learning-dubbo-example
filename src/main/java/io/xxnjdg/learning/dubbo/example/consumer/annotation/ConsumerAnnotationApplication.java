package io.xxnjdg.learning.dubbo.example.consumer.annotation;

import io.xxnjdg.learning.dubbo.example.consumer.common.TestController;
import io.xxnjdg.learning.dubbo.example.swagger.SwaggerAutoConfiguration;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 9:52
 */
@SpringBootApplication
@Import({SwaggerAutoConfiguration.class, TestController.class})
@EnableDubbo(scanBasePackages = "io.xxnjdg.learning.dubbo.example.consumer.annotation")
public class ConsumerAnnotationApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new
                SpringApplicationBuilder(ConsumerAnnotationApplication.class);
        builder.application().setAdditionalProfiles("consumer-annotation");
        builder.run(args);
    }
}