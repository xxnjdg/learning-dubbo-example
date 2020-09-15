package io.xxnjdg.learning.dubbo.example.provider.annotation;

import io.xxnjdg.learning.dubbo.example.api.AsyncService;
import io.xxnjdg.learning.dubbo.example.api.DemoService;
import io.xxnjdg.learning.dubbo.example.api.GroupAndVersionService;
import io.xxnjdg.learning.dubbo.example.api.MergerService;
import io.xxnjdg.learning.dubbo.example.provider.common.*;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/14 0:16
 */
public class AnnotationImpl {

    @DubboService(interfaceClass = AsyncService.class)
    public static class AsyncServiceImpl extends ServiceImpl {
    }

    @DubboService(interfaceClass = DemoService.class)
    public static class DemoServiceImpl extends ServiceImpl {
    }

    @DubboService(interfaceClass = GroupAndVersionService.class,group = "groupA")
    public static class GroupServiceImplA extends CommonServiceImpl.GroupAndVersionServiceImplA {
    }

    @DubboService(interfaceClass = GroupAndVersionService.class,group = "groupB")
    public static class GroupServiceImplB extends CommonServiceImpl.GroupAndVersionServiceImplB {
    }

    @DubboService(interfaceClass = MergerService.class,group = "groupC")
    public static class MergerServiceImplA extends CommonServiceImpl.CommonMergerServiceImplA {
        @Override
        public List<String> testMerger() {
            return Arrays.asList("MergerServiceImplC-1","MergerServiceImplC-2");
        }
    }

    @DubboService(interfaceClass = MergerService.class,group = "groupD")
    public static class MergerServiceImplB extends CommonServiceImpl.CommonMergerServiceImplB {
        @Override
        public List<String> testMerger() {
            return Arrays.asList("MergerServiceImplD-1","MergerServiceImplD-2");
        }
    }

    @DubboService(interfaceClass = GroupAndVersionService.class,version = "1.0.0")
    public static class VersionServiceImplA extends CommonServiceImpl.GroupAndVersionServiceImplA {
    }

    @DubboService(interfaceClass = GroupAndVersionService.class,version = "2.0.0")
    public static class VersionServiceImplB extends CommonServiceImpl.GroupAndVersionServiceImplB {
    }

}
