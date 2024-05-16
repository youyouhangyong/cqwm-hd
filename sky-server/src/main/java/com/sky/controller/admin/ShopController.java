package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("adminShopController")
@RequestMapping("/admin/shop")
@Api(tags = "店铺管理")
@Slf4j
public class ShopController {

    private static String KEY = "SHOP_STATUS";

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 设置店铺状态
     *
     * @param status
     * @return
     */
    @PutMapping("/{status}")
    @ApiOperation("设置店铺状态")
    public Result setStatus(@PathVariable Integer status) {
        // 设置店铺状态
        log.info("设置店铺状态为：{}", status == 1 ? "营业中" : "打样中");

        // 执行设置店铺状态的逻辑
        redisTemplate.opsForValue().set(KEY, status);
        // 返回成功结果
        return Result.success();
    }

    /**
     * 获取店铺状态
     *
     * @return
     */
    @GetMapping("/status")
    @ApiOperation("获取店铺状态")
    public Result<Integer> getStatus() {
        Integer shop_status = (Integer) redisTemplate.opsForValue().get(KEY);
        log.info("获取店铺状态:{}", shop_status == 1 ? "营业中" : "打样中");
        return Result.success(shop_status);
    }

}
