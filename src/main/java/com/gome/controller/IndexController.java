package com.gome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.gome.constant.GomeConstant.*;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/4 19:31
 * @Modified By:
 */
@Controller
public class IndexController {
    @GetMapping("/index")
    public String toIndex() {
        return INDEX;
    }
}
