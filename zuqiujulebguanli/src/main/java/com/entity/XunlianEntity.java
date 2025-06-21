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
 * 训练计划
 *
 * @author 
 * @email
 */
@TableName("xunlian")
public class XunlianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XunlianEntity() {

	}

	public XunlianEntity(T t) {
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
     * 训练计划名称
     */
    @ColumnInfo(comment="训练计划名称",type="varchar(200)")
    @TableField(value = "xunlian_name")

    private String xunlianName;


    /**
     * 训练计划编号
     */
    @ColumnInfo(comment="训练计划编号",type="varchar(200)")
    @TableField(value = "xunlian_uuid_number")

    private String xunlianUuidNumber;


    /**
     * 训练计划照片
     */
    @ColumnInfo(comment="训练计划照片",type="varchar(200)")
    @TableField(value = "xunlian_photo")

    private String xunlianPhoto;


    /**
     * 训练计划类型
     */
    @ColumnInfo(comment="训练计划类型",type="int(11)")
    @TableField(value = "xunlian_types")

    private Integer xunlianTypes;


    /**
     * 训练科目
     */
    @ColumnInfo(comment="训练科目",type="varchar(200)")
    @TableField(value = "xunlian_kemu")

    private String xunlianKemu;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="日期",type="date")
    @TableField(value = "xunlian_time")

    private Date xunlianTime;


    /**
     * 训练计划介绍
     */
    @ColumnInfo(comment="训练计划介绍",type="longtext")
    @TableField(value = "xunlian_content")

    private String xunlianContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "xunlian_delete")

    private Integer xunlianDelete;


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
	 * 获取：训练计划名称
	 */
    public String getXunlianName() {
        return xunlianName;
    }
    /**
	 * 设置：训练计划名称
	 */

    public void setXunlianName(String xunlianName) {
        this.xunlianName = xunlianName;
    }
    /**
	 * 获取：训练计划编号
	 */
    public String getXunlianUuidNumber() {
        return xunlianUuidNumber;
    }
    /**
	 * 设置：训练计划编号
	 */

    public void setXunlianUuidNumber(String xunlianUuidNumber) {
        this.xunlianUuidNumber = xunlianUuidNumber;
    }
    /**
	 * 获取：训练计划照片
	 */
    public String getXunlianPhoto() {
        return xunlianPhoto;
    }
    /**
	 * 设置：训练计划照片
	 */

    public void setXunlianPhoto(String xunlianPhoto) {
        this.xunlianPhoto = xunlianPhoto;
    }
    /**
	 * 获取：训练计划类型
	 */
    public Integer getXunlianTypes() {
        return xunlianTypes;
    }
    /**
	 * 设置：训练计划类型
	 */

    public void setXunlianTypes(Integer xunlianTypes) {
        this.xunlianTypes = xunlianTypes;
    }
    /**
	 * 获取：训练科目
	 */
    public String getXunlianKemu() {
        return xunlianKemu;
    }
    /**
	 * 设置：训练科目
	 */

    public void setXunlianKemu(String xunlianKemu) {
        this.xunlianKemu = xunlianKemu;
    }
    /**
	 * 获取：日期
	 */
    public Date getXunlianTime() {
        return xunlianTime;
    }
    /**
	 * 设置：日期
	 */

    public void setXunlianTime(Date xunlianTime) {
        this.xunlianTime = xunlianTime;
    }
    /**
	 * 获取：训练计划介绍
	 */
    public String getXunlianContent() {
        return xunlianContent;
    }
    /**
	 * 设置：训练计划介绍
	 */

    public void setXunlianContent(String xunlianContent) {
        this.xunlianContent = xunlianContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXunlianDelete() {
        return xunlianDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setXunlianDelete(Integer xunlianDelete) {
        this.xunlianDelete = xunlianDelete;
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
        return "Xunlian{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", xunlianName=" + xunlianName +
            ", xunlianUuidNumber=" + xunlianUuidNumber +
            ", xunlianPhoto=" + xunlianPhoto +
            ", xunlianTypes=" + xunlianTypes +
            ", xunlianKemu=" + xunlianKemu +
            ", xunlianTime=" + DateUtil.convertString(xunlianTime,"yyyy-MM-dd") +
            ", xunlianContent=" + xunlianContent +
            ", xunlianDelete=" + xunlianDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
