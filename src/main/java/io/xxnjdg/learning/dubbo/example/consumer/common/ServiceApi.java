package io.xxnjdg.learning.dubbo.example.consumer.common;

import io.xxnjdg.learning.dubbo.example.api.AsyncService;
import io.xxnjdg.learning.dubbo.example.api.DemoService;
import io.xxnjdg.learning.dubbo.example.api.GroupAndVersionService;
import io.xxnjdg.learning.dubbo.example.api.MergerService;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 9:36
 */
public interface ServiceApi {
    DemoService demoService();
    AsyncService asyncService();
    GroupAndVersionService groupServiceA();
    GroupAndVersionService groupServiceB();
    GroupAndVersionService versionServiceA();
    GroupAndVersionService versionServiceB();
    MergerService mergerServiceA();
    MergerService mergerServiceB();
}
