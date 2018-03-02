package cn.e3mall.manager.mapper;

import cn.e3mall.manager.pojo.TbItem;

import java.util.List;

public interface ITbItemMapper {
    List<TbItem> finTbItemById(Long itemId);
}
