package org.jason.themis.commons.constant;

/**
 * Created by Jason.Xia on 16/7/19.
 */
public interface EventTopic {

    String WORK_THREAD_CHANGE = "WORK_THREAD_CHANGE";
    String NODE_ENABLE = "NODE_ENABLE";
    String NODE_DISABLE = "NODE_DISABLE";

    String NO_ROUTER_AVAILABLE = "NO_ROUTER_AVAILABLE";
    String ROUTER_AVAILABLE = "ROUTER_AVAILABLE";

    String LEADER_CHANGED = "LEADER_CHANGED";

    String NODE_ADD = "NODE_ADD";

    String NODE_REMOVE = "NODE_REMOVE";

    String REGISTRY_HUB_AVAILABLE = "REGISTRY_HUB_AVAILABLE";
    String REGISTRY_HUB_UN_AVAILABLE = "REGISTRY_HUB_UN_AVAILABLE";

    String NODE_SHUT_DOWN = "NODE_SHUT_DOWN";

}
