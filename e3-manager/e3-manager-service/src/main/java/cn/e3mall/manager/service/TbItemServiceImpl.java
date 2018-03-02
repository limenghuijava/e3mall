package cn.e3mall.manager.service;

import cn.e3mall.manager.mapper.ITbItemMapper;
import cn.e3mall.manager.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tbItemService")
public class TbItemServiceImpl  implements ITbItemService{

    @Autowired
    private ITbItemMapper tbItemMapper;

    @Override
    public TbItem findTbItemById(Long itemId) {
        List<TbItem> list=tbItemMapper.finTbItemById(itemId);
        return list.get(0);
    }
}
