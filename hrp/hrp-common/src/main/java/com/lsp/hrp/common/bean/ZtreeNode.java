package com.lsp.hrp.common.bean;

import java.io.Serializable;

/**
 * @author lishupeng
 * @Description
 * @Date 2017/10/24 13:36
 */
public class ZtreeNode implements Serializable {
    private static final long serialVersionUID = -8143936434900817863L;

    private String id;
    private Integer state;
    private String pid;
    private String icon;
    private String iconClose;
    private String iconOpen;
    private String name;
    private boolean open;
    private boolean isParent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconClose() {
        return iconClose;
    }

    public void setIconClose(String iconClose) {
        this.iconClose = iconClose;
    }

    public String getIconOpen() {
        return iconOpen;
    }

    public void setIconOpen(String iconOpen) {
        this.iconOpen = iconOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isParent() {
        return isParent;
    }

    public void setParent(boolean parent) {
        isParent = parent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{id:\"");
        sb.append(id);
        sb.append("\",pId:\"");
        sb.append(pid);
        sb.append("\",name:\"");
        sb.append(name);
        sb.append("\",state:");
        sb.append(state);
        sb.append(",icon:\"");
        sb.append(icon);
        sb.append("\",iconClose:\"");
        sb.append(iconClose);
        sb.append("\",iconOpen:\"");
        sb.append(iconOpen);
        sb.append("\",open:\"");
        sb.append(open);
        sb.append("\",isParent:\"");
        sb.append(isParent);
        sb.append("\"}");
        return sb.toString();
    }
}
