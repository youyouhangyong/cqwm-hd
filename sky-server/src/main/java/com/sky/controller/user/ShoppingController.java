package com.sky.controller.user;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import com.sky.result.Result;
import com.sky.service.ShoppingCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/shoppingCart")
@Slf4j
@Api(tags = "c端 购物车相关接口")
public class ShoppingController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/add")
    @ApiOperation("添加购物车")
    public Result add(@RequestBody ShoppingCartDTO dto){
        log.info("添加购物车,商品信息:{}",dto);
        shoppingCartService.addShoppingCart(dto);
        return Result.success();
    }
    @GetMapping("/list")
    @ApiOperation("获取购物车列表")
    public Result<List> list (){
        log.info("获取购物车列表");
        List<ShoppingCart>list = shoppingCartService.showShoppingCart();
        return Result.success(list);
    }
}
