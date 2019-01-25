package com.hunter.practise.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author 水木
 * @Date 18/9/21  下午5:48
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Value("${swagger.enable}")
    private boolean enableSwagger;

    @Bean
    public Docket helloDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
            //用于分组功能
            .groupName("practise")
            //注册整体api信息
            .apiInfo(apiInfo())
            //swagger功能是否启用
            .enable(enableSwagger)
            .select()
            //指定扫描的包
            .apis(RequestHandlerSelectors.basePackage("com.hunter.practise.busi"))
            //设置此组只匹配hello/**的请求,暂时先不用分组
            //.paths(PathSelectors.ant("/adu/**"))
            .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Spring-boot-practise")
            .description("Spring-boot-practise")
            .contact(new Contact("水木", "", ""))
            .version("1.0.0")
            .build();
    }

}
