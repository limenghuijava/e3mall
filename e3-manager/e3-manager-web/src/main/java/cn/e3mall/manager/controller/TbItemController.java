package cn.e3mall.manager.controller;

import cn.e3mall.manager.pojo.TbItem;
import cn.e3mall.manager.service.ITbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class TbItemController {

    @Autowired
    private ITbItemService tbItemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem findTbItemById(@PathVariable Long itemId){
        TbItem item =tbItemService.findTbItemById(itemId);
        return item;
    }
}
