package ac.dankook.dstagram2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("index")
    public String index1(){
        return "index";
    }

    @RequestMapping("abc")
    public String index2(){
        return "index2";
    }
}
