package io.xxnjdg.learning.dubbo.example.provider.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/14 0:22
 */
@Configuration
public class CommonServiceImpl {

    @Component("commonMergerServiceImplA")
    public static class CommonMergerServiceImplA extends ServiceImpl {
        @Override
        public List<String> testMerger() {
            return Arrays.asList("MergerServiceImplA-1","MergerServiceImplA-2");
        }
    }

    @Component("commonMergerServiceImplB")
    public static class CommonMergerServiceImplB extends ServiceImpl {
        @Override
        public List<String> testMerger() {
            return Arrays.asList("MergerServiceImplB-1","MergerServiceImplB-2");
        }
    }

    @Component("groupAndVersionServiceImplA")
    public static class GroupAndVersionServiceImplA extends ServiceImpl {
        @Override
        public String testGroup(String name) {
            return "CommonGroupServiceImplA "+super.testGroup(name);
        }

        @Override
        public String testVersion(String name) {
            return "CommonGroupServiceImpl 1.0.0 "+super.testVersion(name);
        }
    }

    @Component("groupAndVersionServiceImplB")
    public static class GroupAndVersionServiceImplB extends ServiceImpl {
        @Override
        public String testGroup(String name) {
            return "CommonGroupServiceImplB "+super.testGroup(name);
        }

        @Override
        public String testVersion(String name) {
            return "CommonGroupServiceImpl 2.0.0 "+super.testVersion(name);
        }
    }

}
