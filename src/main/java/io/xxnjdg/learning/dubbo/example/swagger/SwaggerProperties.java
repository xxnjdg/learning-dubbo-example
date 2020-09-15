package io.xxnjdg.learning.dubbo.example.swagger;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 7:55
 */
@Data
@ConfigurationProperties("swagger")
public class SwaggerProperties {

    private String title;
    private String description;
    private String version;
    private String basePackage;

}
