package com.mao.swagger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mao.swagger.beans.ResObject;
import com.mao.swagger.beans.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author panghu
 * @date 18-11-15 下午8:35
 */
@Slf4j
/**
 * tags实在description的前面  如果tags有多个值的话，会生成多个list tags数量来判断controller的数量
 */
@Api(description = "用户接口",tags = {"用户操作接口"})
@RestController
@RequestMapping("/demo")
public class MyController {

    @ApiIgnore
    /***
     * 该注解用于忽略该API,只是在swagger当中
     *
     */
    @ApiOperation(value = "创建用户",notes = "新增注册")
    @RequestMapping(value="/createUser",method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResObject createUser(@RequestBody User user){
        System.out.println("createUser:::"+user.toString());
        return new ResObject(HttpStatus.OK.value(), "新增成功.");
    }

    @ApiOperation(value = "修改用户")
    /**
     * RequestMapping中的consumes指的是指定处理请求的内容类型，例如application/json, text/html;
     * RequestMapping中的produces指定返回值的类型，仅当request请求头中的Accept请求头中的（Accept）类型包含该类型
     */
    @RequestMapping(value="/updateUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResObject updateUser(@RequestBody User user){
        System.out.println("updateUser:::"+user.toString());
        return new ResObject(HttpStatus.OK.value(), "修改成功.");
    }

    /**
     * @Apioperation 中的value指的是接口的名称    note是关于这个接口的相关信息
     * @param userId
     * @return
     */
    @ApiOperation(value = "删除用户" ,  notes="删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
    public ResObject deleteUser(@RequestParam("userId") String userId){
        System.out.println("deleteUser:::"+userId);
        return new ResObject(HttpStatus.OK.value(), "删除成功.");
    }


    @ApiOperation(value = "查询用户" ,  notes="查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/queryUser",method=RequestMethod.GET)
    public ResObject queryUser(@RequestParam("userId") String userId){
        System.out.println("queryUser:::"+userId);
        User user = new User(userId, "张三", "******", "mao2080@sina.com");
        log.info("查询方法 ：查询成功......................");
        return new ResObject(HttpStatus.OK.value(), user);
    }

}
