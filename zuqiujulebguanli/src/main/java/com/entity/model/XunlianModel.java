package com.entity.model;

import com.entity.XunlianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 训练计划
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XunlianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 训练计划名称
     */
    private String xunlianName;


    /**
     * 训练计划编号
     */
    private String xunlianUuidNumber;


    /**
     * 训练计划照片
     */
    private String xunlianPhoto;


    /**
     * 训练计划类型
     */
    private Integer xunlianTypes;


    /**
     * 训练科目
     */
    private String xunlianKemu;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date xunlianTime;


    /**
     * 训练计划介绍
     */
    private String xunlianContent;


    /**
     * 逻辑删除
     */
    private Integer xunlianDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
