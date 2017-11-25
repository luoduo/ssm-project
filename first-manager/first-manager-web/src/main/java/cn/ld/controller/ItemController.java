package cn.ld.controller;

import cn.ld.pojo.TbItem;
import cn.ld.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 商品管理controller
 */
@Controller
public class ItemController {

    @Resource
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public Object getItemById(@PathVariable long itemId){
        TbItem item = itemService.getItemById(itemId);
        System.out.println(String.valueOf(item.getSellPoint()));
        return item;
    }

}
