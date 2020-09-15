package io.xxnjdg.learning.dubbo.example.provider.common;

import io.xxnjdg.learning.dubbo.example.api.AllService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 8:53
 */
@Component
public class ServiceImpl implements AllService {
    @Override
    public String sayHello(String name) {
        return "hello world " + name;
    }

    @Override
    public String testConsumerAsync(String name) {
        return "testAsync hello world " + name;
    }

    @Override
    public String testProviderAsync(String name) {
        return null;
    }

    @Override
    public String testGroup(String name) {
        return "testGroup hello world " + name;
    }

    @Override
    public String testVersion(String name) {
        return "testVersion hello world " + name;
    }

    @Override
    public List<String> testMerger() {
        return null;
    }
}