package com.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：映射视图资源
 * @author LJH
 * @date 2019/10/2-10:18
 * @QQ 1755497577
 */
@Controller
public class PageController {

    @RequestMapping("/page")
    public String getPage(String pagename){
        return pagename;
    }

}
