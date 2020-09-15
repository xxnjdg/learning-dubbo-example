package io.xxnjdg.learning.dubbo.example.api;

import java.util.List;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/9/2 22:36
 */
public interface MergerService {

    /**
     * 使用 merger 时
     * org.apache.dubbo.rpc.cluster.merger.MergerFactory#loadMergers() 查看支持的返回值类型
     * 目前支持以下返回值
     * BooleanArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     * LongArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     * ListMerger (org.apache.dubbo.rpc.cluster.merger)
     * FloatArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     * DoubleArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     * ArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     * CharArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     * ShortArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     * SetMerger (org.apache.dubbo.rpc.cluster.merger)
     * MapMerger (org.apache.dubbo.rpc.cluster.merger)
     * ByteArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     * IntArrayMerger (org.apache.dubbo.rpc.cluster.merger)
     *
     * 都是容器和数组
     * @return
     */
    List<String> testMerger();

}
