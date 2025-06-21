package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 球员数据
 *
 * @author 
 * @email
 */
@TableName("shuju")
public class ShujuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShujuEntity() {

	}

	public ShujuEntity(T t) {
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
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 球员数据名称
     */
    @ColumnInfo(comment="球员数据名称",type="varchar(200)")
    @TableField(value = "shuju_name")

    private String shujuName;


    /**
     * 球员数据编号
     */
    @ColumnInfo(comment="球员数据编号",type="varchar(200)")
    @TableField(value = "shuju_uuid_number")

    private String shujuUuidNumber;


    /**
     * 球员数据照片
     */
    @ColumnInfo(comment="球员数据照片",type="varchar(200)")
    @TableField(value = "shuju_photo")

    private String shujuPhoto;


    /**
     * 球员数据类型
     */
    @ColumnInfo(comment="球员数据类型",type="int(11)")
    @TableField(value = "shuju_types")

    private Integer shujuTypes;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="日期",type="date")
    @TableField(value = "shuju_time")

    private Date shujuTime;


    /**
     * 球员数据介绍
     */
    @ColumnInfo(comment="球员数据介绍",type="longtext")
    @TableField(value = "shuju_content")

    private String shujuContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "shuju_delete")

    private Integer shujuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：球员数据名称
	 */
    public String getShujuName() {
        return shujuName;
    }
    /**
	 * 设置：球员数据名称
	 */

    public void setShujuName(String shujuName) {
        this.shujuName = shujuName;
    }
    /**
	 * 获取：球员数据编号
	 */
    public String getShujuUuidNumber() {
        return shujuUuidNumber;
    }
    /**
	 * 设置：球员数据编号
	 */

    public void setShujuUuidNumber(String shujuUuidNumber) {
        this.shujuUuidNumber = shujuUuidNumber;
    }
    /**
	 * 获取：球员数据照片
	 */
    public String getShujuPhoto() {
        return shujuPhoto;
    }
    /**
	 * 设置：球员数据照片
	 */

    public void setShujuPhoto(String shujuPhoto) {
        this.shujuPhoto = shujuPhoto;
    }
    /**
	 * 获取：球员数据类型
	 */
    public Integer getShujuTypes() {
        return shujuTypes;
    }
    /**
	 * 设置：球员数据类型
	 */

    public void setShujuTypes(Integer shujuTypes) {
        this.shujuTypes = shujuTypes;
    }
    /**
	 * 获取：日期
	 */
    public Date getShujuTime() {
        return shujuTime;
    }
    /**
	 * 设置：日期
	 */

    public void setShujuTime(Date shujuTime) {
        this.shujuTime = shujuTime;
    }
    /**
	 * 获取：球员数据介绍
	 */
    public String getShujuContent() {
        return shujuContent;
    }
    /**
	 * 设置：球员数据介绍
	 */

    public void setShujuContent(String shujuContent) {
        this.shujuContent = shujuContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getShujuDelete() {
        return shujuDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setShujuDelete(Integer shujuDelete) {
        this.shujuDelete = shujuDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Shuju{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", shujuName=" + shujuName +
            ", shujuUuidNumber=" + shujuUuidNumber +
            ", shujuPhoto=" + shujuPhoto +
            ", shujuTypes=" + shujuTypes +
            ", shujuTime=" + DateUtil.convertString(shujuTime,"yyyy-MM-dd") +
            ", shujuContent=" + shujuContent +
            ", shujuDelete=" + shujuDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
