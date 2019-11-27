package com.nf.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.nf.ssm.entity.UserInfo;
import com.nf.ssm.service.DeptService;
import com.nf.ssm.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/userinfo")
public class HomeController {

    @Autowired
    private UserInfoService service;
    @Autowired
    private DeptService deptService;

    @RequestMapping("/list")
    public String getAll(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
                         @RequestParam(value = "PageSize", required = false, defaultValue = "3") int PageSize,
                         Model model) {
        List<UserInfo> userInfos = service.pageListAll(pageNum, PageSize);
        PageInfo pageInfo = new PageInfo(userInfos);
        model.addAttribute("list", pageInfo);
        return "list";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }

    @PostMapping("/insert")
    public String insert(@Valid UserInfo userInfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add";
        }
        service.insert(userInfo);
        return "redirect:/userinfo/list";
    }

    @GetMapping("/delete")
    public String delete(int deptid) {
        deptService.deleteByid(deptid);
        return "/dept/list";
    }
}
