package io.xxnjdg.learning.dubbo.example.consumer.xml;

import io.xxnjdg.learning.dubbo.example.api.AsyncService;
import io.xxnjdg.learning.dubbo.example.api.DemoService;
import io.xxnjdg.learning.dubbo.example.api.GroupAndVersionService;
import io.xxnjdg.learning.dubbo.example.api.MergerService;
import io.xxnjdg.learning.dubbo.example.consumer.common.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 9:40
 */
@Service
public class XmlService implements ServiceApi {

    @Autowired
    private DemoService demoService;

    @Autowired
    private AsyncService asyncService;

    @Autowired
    private GroupAndVersionService groupServiceA;

    @Autowired
    private GroupAndVersionService groupServiceB;

    @Autowired
    private GroupAndVersionService versionServiceA;

    @Autowired
    private GroupAndVersionService versionServiceB;

    @Autowired
    private MergerService mergerServiceA;

    @Autowired
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
