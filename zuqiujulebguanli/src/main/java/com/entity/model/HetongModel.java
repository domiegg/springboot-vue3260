package com.entity.model;

import com.entity.HetongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 合同
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HetongModel implements Serializable {
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
     * 合同标题
     */
    private String hetongName;


    /**
     * 上传合同
     */
    private String hetongFile;


    /**
     * 备注
     */
    private String hetongText;


    /**
     * 逻辑删除
     */
    private Integer hetongDelete;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：合同标题
	 */
    public String getHetongName() {
        return hetongName;
    }


    /**
	 * 设置：合同标题
	 */
    public void setHetongName(String hetongName) {
        this.hetongName = hetongName;
    }
    /**
	 * 获取：上传合同
	 */
    public String getHetongFile() {
        return hetongFile;
    }


    /**
	 * 设置：上传合同
	 */
    public void setHetongFile(String hetongFile) {
        this.hetongFile = hetongFile;
    }
    /**
	 * 获取：备注
	 */
    public String getHetongText() {
        return hetongText;
    }


    /**
	 * 设置：备注
	 */
    public void setHetongText(String hetongText) {
        this.hetongText = hetongText;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getHetongDelete() {
        return hetongDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setHetongDelete(Integer hetongDelete) {
        this.hetongDelete = hetongDelete;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
