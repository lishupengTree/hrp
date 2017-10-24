package com.lsp.his.entity.system;

import com.lsp.hrp.mybatis.annotation.Column;
import com.lsp.hrp.mybatis.annotation.Table;
import com.lsp.hrp.mybatis.commons.Entity;
import com.lsp.hrp.mybatis.commons.IdCol;

import java.math.BigDecimal;

/**
 * @author lishupeng
 * @Description
 * @Date 2017/10/24 17:35
 */
@Table
public class BasSystemMenu extends Entity {

    /**
     * 实体元数据(列属性常量接口)
     */
    public interface BasSystemMenuMeta extends IdCol {
        String pid = "pid";
        String name = "name";
        String url = "url";
        String image = "image";
        String menuType = "menuType";
        String openType = "openType";
        String indexNo = "indexNo";
        String hotkeys = "hotkeys";
        String defaultOpen = "defaultOpen";
    }



    /**
     * 列属性
     */
    /**  */
    @Column
    private String pid;
    /**  */
    @Column
    private String name;
    /**  */
    @Column
    private String url;
    /**  */
    @Column
    private String image;
    /**  */
    @Column
    private String menuType;
    /**  */
    @Column
    private String openType;
    /**  */
    @Column
    private BigDecimal indexNo;
    /**  */
    @Column
    private String hotkeys;
    /**  */
    @Column
    private String defaultOpen;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }

    public BigDecimal getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(BigDecimal indexNo) {
        this.indexNo = indexNo;
    }

    public String getHotkeys() {
        return hotkeys;
    }

    public void setHotkeys(String hotkeys) {
        this.hotkeys = hotkeys;
    }

    public String getDefaultOpen() {
        return defaultOpen;
    }

    public void setDefaultOpen(String defaultOpen) {
        this.defaultOpen = defaultOpen;
    }
}

