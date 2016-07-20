package org.jason.themis.core.domain.monitor;

import java.util.Map;

/**
 * Created by Jason.Xia on 16/7/19.
 */
public class JvmInfo extends BaseInfo {
    private Map<String, Object> memoryPool;
    private Map<String, Object> gcInfo;
    private Map<String, Object> threadInfo;

    public Map<String, Object> getMemoryPool() {
        return memoryPool;
    }

    public void setMemoryPool(Map<String, Object> memoryPool) {
        this.memoryPool = memoryPool;
    }

    public Map<String, Object> getGcInfo() {
        return gcInfo;
    }

    public void setGcInfo(Map<String, Object> gcInfo) {
        this.gcInfo = gcInfo;
    }

    public Map<String, Object> getThreadInfo() {
        return threadInfo;
    }

    public void setThreadInfo(Map<String, Object> threadInfo) {
        this.threadInfo = threadInfo;
    }
}
