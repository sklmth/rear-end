package com.sport.controller.v1;

import com.sport.common.pojo.entity.AdminUser;
import com.sport.common.result.Result;
import com.sport.mapper.TestMapper;
import com.sport.common.pojo.entity.Dish;
import com.sport.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
//@RequestMapping("/search")
public class test {
    @Autowired
    private TestService testService;

    @Autowired
    private TestMapper testMapper;
    @RequestMapping("/search")
    public Dish hello(){
        return testService.test();
    }

    @RequestMapping("/test")
    public Result test() {
        log.info("test");
        return Result.success();
    }

    @PostMapping("/login")
    public Result<AdminUser> search(){
        AdminUser adminUser = testMapper.searchForAdmin();
        return Result.success(adminUser);
    }
}
