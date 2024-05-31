package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

public interface ShoppingCartService {


    /**
     * 添加商品到购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

//    /**
//     * 删除购物车中的商品
//     * @param productId
//     * @param userId
//     */
//    void deleteProduct(Long productId, Long userId);
//
}
