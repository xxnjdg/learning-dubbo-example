package io.xxnjdg.learning.dubbo.example.consumer.common;

import io.xxnjdg.learning.dubbo.example.api.AllService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;


/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/1 20:35
 */
@RestController
@Slf4j
public class TestController implements AllService {

    @Autowired
    private ServiceApi serviceApi;

    @GetMapping("/sayHello")
    @Override
    public String sayHello(String name) {
        return serviceApi.demoService().sayHello(name);
    }

    @Override
    @GetMapping("/testAsync")
    public String testConsumerAsync(String name) {
        //默认消费者调用是同步模式
        //设置消费者调用异步方式
        //1 手动激活 reference 配置 async 属性
        //1）referenceConfig 设置 async = true
        //2) 方法调用后返回为null
        String result = serviceApi.asyncService().testConsumerAsync(name);
        log.info("返回结果: "+result);

        //3) RpcContext.getContext().getCompletableFutue(); 获取 CompletableFuture<String>
        // 拿到调用的Future引用，当结果返回后，会被通知和设置到此Future
        CompletableFuture<String> completableFuture = RpcContext.getContext().getCompletableFuture();

        //4) 绑定 whenComplete 为Future添加回调
        completableFuture.whenComplete((s, throwable) -> {
            if (throwable == null) {
                log.info(LocalDateTime.now() + " asyncService结果 " + s);
            } else {
                throwable.printStackTrace();
            }
        });

        log.info(LocalDateTime.now() + " asyncService工作结束");

        //2 RpcContext 自动激活 reference 配置 async 属性
        //1) 使用 RpcContext.getContext().asyncCall 异步调用，不需要我们手动修改 async 属性
        CompletableFuture<String> helloFuture = RpcContext.getContext().asyncCall(() -> {
            return serviceApi.demoService().sayHello(name);
        });

        //2) 绑定 whenComplete 为Future添加回调
        helloFuture.whenComplete((s, throwable) -> {
            if (throwable == null) {
                log.info(LocalDateTime.now() + " demoService结果 " + s);
            } else {
                throwable.printStackTrace();
            }
        });

        log.info(LocalDateTime.now() + " demoService工作结束");

        return "success";
    }

    @Override
    public String testProviderAsync(String name) {
        return null;
    }

    @GetMapping("/testGroupA")
    public String testGroupA(String name) {
        return serviceApi.groupServiceA().testGroup(name);
    }

    @GetMapping("/testGroupB")
    public String testGroupB(String name) {
        return serviceApi.groupServiceB().testGroup(name);
    }

    @GetMapping("/testVersionA")
    public String testVersionA(String name) {
        return serviceApi.versionServiceA().testVersion(name);
    }

    @GetMapping("/testVersionB")
    public String testVersionB(String name) {
        return serviceApi.versionServiceB().testVersion(name);
    }

    @GetMapping("/testMergerA")
    public List<String> testMergerA() {
        return serviceApi.mergerServiceA().testMerger();
    }

    @GetMapping("/testMergerB")
    public List<String> testMergerB() {
        return serviceApi.mergerServiceB().testMerger();
    }

    @Override
    public String testGroup(String name) {
        return null;
    }

    @Override
    public String testVersion(String name) {
        return null;
    }

    @Override
    public List<String> testMerger() {
        return null;
    }


}
