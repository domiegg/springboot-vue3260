package com.entity.model;

import com.entity.ShujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 球员数据
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShujuModel implements Serializable {
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
     * 球员数据名称
     */
    private String shujuName;


    /**
     * 球员数据编号
     */
    private String shujuUuidNumber;


    /**
     * 球员数据照片
     */
    private String shujuPhoto;


    /**
     * 球员数据类型
     */
    private Integer shujuTypes;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shujuTime;


    /**
     * 球员数据介绍
     */
    private String shujuContent;


    /**
     * 逻辑删除
     */
    private Integer shujuDelete;


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
