package cn.ld.service.impl;

import cn.ld.mapper.TbItemMapper;
import cn.ld.pojo.TbItem;
import cn.ld.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService {

    @Resource
    private TbItemMapper tbItemMapper;

    public TbItem getItemById(Long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }
}
