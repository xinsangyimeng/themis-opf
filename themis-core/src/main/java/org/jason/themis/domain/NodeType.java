package org.jason.themis.domain;

import org.jason.themis.commons.utils.StringUtils;

/**
 * Created by Jason.Xia on 16/7/19.
 */
public enum NodeType {
    REGISTRY_HUB,
    ROUTER,
    MONITOR,
    ADMIN;

    public static NodeType convert(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }

        return NodeType.valueOf(value);
    }
}
