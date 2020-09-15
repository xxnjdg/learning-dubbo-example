package io.xxnjdg.learning.dubbo.example.consumer.annotation;

import io.xxnjdg.learning.dubbo.example.api.AsyncService;
import io.xxnjdg.learning.dubbo.example.api.DemoService;
import io.xxnjdg.learning.dubbo.example.api.GroupAndVersionService;
import io.xxnjdg.learning.dubbo.example.api.MergerService;
import io.xxnjdg.learning.dubbo.example.consumer.common.ServiceApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 10:15
 */
@Service
public class AnnotationService implements ServiceApi {
    @DubboReference
    private DemoService demoService;

    @DubboReference(async = true)
    private AsyncService asyncService;

    @DubboReference(group = "groupA")
    private GroupAndVersionService groupServiceA;

    @DubboReference(group = "groupB")
    private GroupAndVersionService groupServiceB;

    @DubboReference(version = "1.0.0")
    private GroupAndVersionService versionServiceA;

    @DubboReference(version = "2.0.0")
    private GroupAndVersionService versionServiceB;

    @DubboReference(group = "*",merger = "true")
    private MergerService mergerServiceA;

    @DubboReference(group = "groupB,groupD",merger = "true")
    private MergerService mergerServiceB;

    @Override
    public DemoService demoService() {
        return demoService;
    }

    @Override
    public AsyncService asyncService() {
        return asyncService;
    }

    @Override
    public GroupAndVersionService groupServiceA() {
        return groupServiceA;
    }

    @Override
    public GroupAndVersionService groupServiceB() {
        return groupServiceB;
    }

    @Override
    public GroupAndVersionService versionServiceA() {
        return versionServiceA;
    }

    @Override
    public GroupAndVersionService versionServiceB() {
        return versionServiceB;
    }

    @Override
    public MergerService mergerServiceA() {
        return mergerServiceA;
    }

    @Override
    public MergerService mergerServiceB() {
        return mergerServiceB;
    }
}
