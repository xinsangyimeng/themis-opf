package org.jason.themis.core.domain.monitor;

import org.jason.themis.core.domain.NodeType;

/**
 * Created by Jason.Xia on 16/7/19.
 */
public class NodeInfo extends BaseInfo {
    private NodeType nodeType;
    private String group;
    private String id;

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
