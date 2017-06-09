package com.team.union.web;

import com.team.union.service.UserService;
import com.team.union.util.PublicUtil;
import com.team.union.util.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhongxia on 6/5/17.
 */
@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
