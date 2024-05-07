package com.sky.service;

import com.sky.dto.DishDTO;

public interface DishService {
    /**
     * 保存菜品信息和口味信息
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
