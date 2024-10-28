package com.entity.vo;

import com.entity.GongyingshangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 供应商
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-04-02
 */
@TableName("gongyingshang")
public class GongyingshangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 供应商名称 Search
     */

    @TableField(value = "name")
    private String name;


    /**
     * 供应商品
     */

    @TableField(value = "goods")
    private String goods;


    /**
     * 供应商联系方式
     */

    @TableField(value = "phone")
    private String phone;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：供应商名称 Search
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：供应商名称 Search
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：供应商品
	 */
    public String getGoods() {
        return goods;
    }


    /**
	 * 获取：供应商品
	 */

    public void setGoods(String goods) {
        this.goods = goods;
    }
    /**
	 * 设置：供应商联系方式
	 */
    public String getPhone() {
        return phone;
    }


    /**
	 * 获取：供应商联系方式
	 */

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
