package org.jason.themis.domain.monitor;

import org.jason.themis.domain.Serialize;

/**
 * Created by Jason.Xia on 16/7/19.
 */
public class BaseInfo extends Serialize {
    private Long timestamp;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
