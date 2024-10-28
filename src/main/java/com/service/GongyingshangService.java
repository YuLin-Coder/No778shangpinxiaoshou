package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongyingshangEntity;
import java.util.Map;

/**
 * 供应商 服务类
 * @since 2021-04-02
 */
public interface GongyingshangService extends IService<GongyingshangEntity> {

     PageUtils queryPage(Map<String, Object> params);

}