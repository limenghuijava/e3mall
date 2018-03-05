package cn.e3mall.manager.service;

import cn.e3mall.manager.pojo.TbItem;

public interface ITbItemService {
    TbItem findTbItemById(Long itemId);
}
