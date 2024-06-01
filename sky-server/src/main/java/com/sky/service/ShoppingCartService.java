package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {


    /**
     * 添加商品到购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 显示购物车中的商品
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车
     */
    void clearShoppingCart();

//    /**
//     * 删除购物车中的商品
//     * @param productId
//     * @param userId
//     */
//    void deleteProduct(Long productId, Long userId);
//
}
