package com.alexggg99.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexggg99 on 15.10.15.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    private String index(){
        return "index";
    }

    @RequestMapping("/views/main")
    private String indexM() {
        return "views/main";
    }

}
