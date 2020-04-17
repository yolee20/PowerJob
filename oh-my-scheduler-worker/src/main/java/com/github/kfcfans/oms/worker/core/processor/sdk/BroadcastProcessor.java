package com.github.kfcfans.oms.worker.core.processor.sdk;

import com.github.kfcfans.oms.worker.core.processor.ProcessResult;
import com.github.kfcfans.oms.worker.core.processor.TaskContext;

import java.util.Map;

/**
 * 广播执行处理器，适用于广播执行
 *
 * @author tjq
 * @since 2020/3/18
 */
public interface BroadcastProcessor extends BasicProcessor {

    /**
     * 在所有节点广播执行前执行，只会在一台机器执行一次
     */
    ProcessResult preProcess(TaskContext context) throws Exception;
    /**
     * 在所有节点广播执行完成后执行，只会在一台机器执行一次
     */
    ProcessResult postProcess(TaskContext context, Map<String, String> taskId2Result) throws Exception;
}
