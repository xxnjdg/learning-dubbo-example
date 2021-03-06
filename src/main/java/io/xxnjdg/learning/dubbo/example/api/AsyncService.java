package io.xxnjdg.learning.dubbo.example.api;


/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 7:26
 */
public interface AsyncService {
    /**
     * 详情看例子
     * @param name
     * @return
     */
    String testConsumerAsync(String name);
    String testProviderAsync(String name);

}
