package cn.e3mall.manager.impl;

import cn.e3mall.manager.mapper.ITbItemMapper;
import cn.e3mall.manager.pojo.TbItem;
import cn.e3mall.manager.service.ITbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbItemServiceImpl  implements ITbItemService {

    @Autowired
    private ITbItemMapper tbItemMapper;

    @Override
    public TbItem findTbItemById(Long itemId) {
        List<TbItem> list=tbItemMapper.finTbItemById(itemId);
        return list.get(0);
    }
}
