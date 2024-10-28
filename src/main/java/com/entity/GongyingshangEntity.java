package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 供应商
 *
 * @email
 * @date 2021-04-02
 */
@TableName("gongyingshang")
public class GongyingshangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public GongyingshangEntity() {

    }

    public GongyingshangEntity(T t) {
    try {
    BeanUtils.copyProperties(this, t);
    } catch (IllegalAccessException | InvocationTargetException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 供应商名称
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
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：供应商名称
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：供应商名称
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

    @Override
    public String toString() {
    return "Gongyingshang{" +
            "id=" + id +
            ", name=" + name +
            ", goods=" + goods +
            ", phone=" + phone +
            ", createTime=" + createTime +
    "}";
    }
    }
