package com.entity.vo;

import com.entity.HetongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 合同
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("hetong")
public class HetongVO implements Serializable {
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
     * 合同标题
     */

    @TableField(value = "hetong_name")
    private String hetongName;


    /**
     * 上传合同
     */

    @TableField(value = "hetong_file")
    private String hetongFile;


    /**
     * 备注
     */

    @TableField(value = "hetong_text")
    private String hetongText;


    /**
     * 逻辑删除
     */

    @TableField(value = "hetong_delete")
    private Integer hetongDelete;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：合同标题
	 */
    public String getHetongName() {
        return hetongName;
    }


    /**
	 * 获取：合同标题
	 */

    public void setHetongName(String hetongName) {
        this.hetongName = hetongName;
    }
    /**
	 * 设置：上传合同
	 */
    public String getHetongFile() {
        return hetongFile;
    }


    /**
	 * 获取：上传合同
	 */

    public void setHetongFile(String hetongFile) {
        this.hetongFile = hetongFile;
    }
    /**
	 * 设置：备注
	 */
    public String getHetongText() {
        return hetongText;
    }


    /**
	 * 获取：备注
	 */

    public void setHetongText(String hetongText) {
        this.hetongText = hetongText;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getHetongDelete() {
        return hetongDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setHetongDelete(Integer hetongDelete) {
        this.hetongDelete = hetongDelete;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
