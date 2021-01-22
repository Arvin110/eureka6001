package com.arvin.client;

import com.arvin.pojo.CommonResult;
import com.arvin.pojo.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Arvin
 * @date 2021/1/12
 **/
//添加FeignClient注解（需要先添加spring-cloud-starter-openfeign的依赖）
//指定实现的应用名称，这个名称和注册中心一样，大小写无所谓
//方法名和请求方式路径参数要一致，
// 普通参数需要添加@RequestParam注解
@FeignClient(name = "users-provider")
@RequestMapping("/provider")
public interface UsersClient {
    @PostMapping("/login.action")
    public CommonResult login(Users users);

    @PostMapping("/add.action")
    public CommonResult add(Users users);


}
