package io.xxnjdg.learning.dubbo.example.consumer.xml;


import io.xxnjdg.learning.dubbo.example.consumer.common.TestController;
import io.xxnjdg.learning.dubbo.example.swagger.SwaggerAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/1 20:20
 */
@SpringBootApplication
@Import({SwaggerAutoConfiguration.class, TestController.class})
@ImportResource("classpath:/consumer/dubbo-demo-consumer.xml")
public class ConsumerXmlApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new
                SpringApplicationBuilder(ConsumerXmlApplication.class);
        builder.application().setAdditionalProfiles("consumer-xml");
        builder.run(args);
    }
}
