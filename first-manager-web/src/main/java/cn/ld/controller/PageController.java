package cn.ld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 */
@Controller
public class PageController {

    /**
     * 后台首页展示
     * @return
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    /**
     *
     * @return
     */
    @RequestMapping("/{page}")
    public String showItemList(@PathVariable String page){
        return page;
    }


}

