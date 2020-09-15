package io.xxnjdg.learning.dubbo.example.provider.xml;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/1 20:19
 */
@SpringBootApplication(scanBasePackages = {
        "io.xxnjdg.learning.dubbo.example.provider.common",
        "io.xxnjdg.learning.dubbo.example.provider.xml"})
@ImportResource("classpath:/provider/dubbo-demo-provider.xml")
public class ProviderXmlApplication {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new
                SpringApplicationBuilder(ProviderXmlApplication.class);
        builder.application().setAdditionalProfiles("provider-xml");
        builder.run(args);
    }
}
