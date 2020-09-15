package io.xxnjdg.learning.dubbo.example.provider.xml;

import io.xxnjdg.learning.dubbo.example.provider.common.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 15:32
 */
//@Configuration
public class XmlServiceConfiguration {

    @Bean
    public ServiceImpl serviceImpl(){
        return new ServiceImpl();
    }

    @Bean
    public CommonServiceImpl.GroupAndVersionServiceImplA commonGroupServiceImplA(){
        return new CommonServiceImpl.GroupAndVersionServiceImplA();
    }

    @Bean
    public CommonServiceImpl.GroupAndVersionServiceImplB commonGroupServiceImplB(){
        return new CommonServiceImpl.GroupAndVersionServiceImplB();
    }

    @Bean
    public CommonServiceImpl.GroupAndVersionServiceImplA versionServiceImplA(){
        return new CommonServiceImpl.GroupAndVersionServiceImplA();
    }

    @Bean
    public CommonServiceImpl.GroupAndVersionServiceImplB versionServiceImplB(){
        return new CommonServiceImpl.GroupAndVersionServiceImplB();
    }

    @Bean
    public CommonServiceImpl.CommonMergerServiceImplA commonMergerServiceImplA(){
        return new CommonServiceImpl.CommonMergerServiceImplA();
    }

    @Bean
    public CommonServiceImpl.CommonMergerServiceImplB commonMergerServiceImplB(){
        return new CommonServiceImpl.CommonMergerServiceImplB();
    }

}
