package cn.ld.controller;

import cn.ld.pojo.TbItem;
import cn.ld.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 商品管理controller
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public Object getItemById(@PathVariable long itemId){
        TbItem item = itemService.getItemById(itemId);
        System.out.println(String.valueOf(item.getSellPoint()));
        return item;
    }

    /**
     * 分页查询商品列表
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public Object getItemList(@RequestParam(name ="page" ,required=false) String pageSize,
                              @RequestParam(name ="rows" ,required=false) String pageNum){
        TbItem item = itemService.getItemById(itemId);
        System.out.println(String.valueOf(item.getSellPoint()));
        return item;
    }

}
