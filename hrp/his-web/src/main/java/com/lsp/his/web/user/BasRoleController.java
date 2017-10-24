package com.lsp.his.web.user;

import com.lsp.his.utils.StrUtil;
import com.lsp.his.web.AbstractController;
import com.lsp.hrp.common.bean.Reply;
import com.lsp.hrp.common.bean.ZtreeNode;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @author lishupeng
 * @Date 2017/10/24 13:26
 */
@Controller
@RequestMapping("/user/role")
public class BasRoleController extends AbstractController{


    /**
     * menu_tree
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "menu_tree", method = RequestMethod.GET)
    @ResponseBody
    public Reply menuTree() throws Exception{
        Reply reply = new Reply();
        List<String> lstTree = new ArrayList<String>();
        List<Map> scopeList = null;
        if(CollectionUtils.isNotEmpty(scopeList)){
            for (Map map : scopeList){
                ZtreeNode ztreeNode = new ZtreeNode();
                ztreeNode.setId(StrUtil.objToStr(map.get("id")));
                ztreeNode.setPid(StrUtil.objToStr(map.get("pid")));
                ztreeNode.setName(StrUtil.objToStr(map.get("name")));
                ztreeNode.setOpen("root".equals(StrUtil.objToStr(map.get("id"))));
                lstTree.add(ztreeNode.toString());
            }
        }
        reply.setData(lstTree);
        return reply;
    }

}
