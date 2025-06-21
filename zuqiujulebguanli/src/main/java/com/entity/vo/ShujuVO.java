package com.entity.vo;

import com.entity.ShujuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 球员数据
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shuju")
public class ShujuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 球员数据名称
     */

    @TableField(value = "shuju_name")
    private String shujuName;


    /**
     * 球员数据编号
     */

    @TableField(value = "shuju_uuid_number")
    private String shujuUuidNumber;


    /**
     * 球员数据照片
     */

    @TableField(value = "shuju_photo")
    private String shujuPhoto;


    /**
     * 球员数据类型
     */

    @TableField(value = "shuju_types")
    private Integer shujuTypes;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shuju_time")
    private Date shujuTime;


    /**
     * 球员数据介绍
     */

    @TableField(value = "shuju_content")
    private String shujuContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "shuju_delete")
    private Integer shujuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：球员数据名称
	 */
    public String getShujuName() {
        return shujuName;
    }


    /**
	 * 获取：球员数据名称
	 */

    public void setShujuName(String shujuName) {
        this.shujuName = shujuName;
    }
    /**
	 * 设置：球员数据编号
	 */
    public String getShujuUuidNumber() {
        return shujuUuidNumber;
    }


    /**
	 * 获取：球员数据编号
	 */

    public void setShujuUuidNumber(String shujuUuidNumber) {
        this.shujuUuidNumber = shujuUuidNumber;
    }
    /**
	 * 设置：球员数据照片
	 */
    public String getShujuPhoto() {
        return shujuPhoto;
    }


    /**
	 * 获取：球员数据照片
	 */

    public void setShujuPhoto(String shujuPhoto) {
        this.shujuPhoto = shujuPhoto;
    }
    /**
	 * 设置：球员数据类型
	 */
    public Integer getShujuTypes() {
        return shujuTypes;
    }


    /**
	 * 获取：球员数据类型
	 */

    public void setShujuTypes(Integer shujuTypes) {
        this.shujuTypes = shujuTypes;
    }
    /**
	 * 设置：日期
	 */
    public Date getShujuTime() {
        return shujuTime;
    }


    /**
	 * 获取：日期
	 */

    public void setShujuTime(Date shujuTime) {
        this.shujuTime = shujuTime;
    }
    /**
	 * 设置：球员数据介绍
	 */
    public String getShujuContent() {
        return shujuContent;
    }


    /**
	 * 获取：球员数据介绍
	 */

    public void setShujuContent(String shujuContent) {
        this.shujuContent = shujuContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getShujuDelete() {
        return shujuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShujuDelete(Integer shujuDelete) {
        this.shujuDelete = shujuDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
