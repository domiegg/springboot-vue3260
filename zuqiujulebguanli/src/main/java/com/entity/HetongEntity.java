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
 * 合同
 *
 * @author 
 * @email
 */
@TableName("hetong")
public class HetongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HetongEntity() {

	}

	public HetongEntity(T t) {
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
     * 合同标题
     */
    @ColumnInfo(comment="合同标题",type="varchar(200)")
    @TableField(value = "hetong_name")

    private String hetongName;


    /**
     * 上传合同
     */
    @ColumnInfo(comment="上传合同",type="varchar(200)")
    @TableField(value = "hetong_file")

    private String hetongFile;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="text")
    @TableField(value = "hetong_text")

    private String hetongText;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "hetong_delete")

    private Integer hetongDelete;


    /**
     * 创建时间  listShow
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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Hetong{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", hetongName=" + hetongName +
            ", hetongFile=" + hetongFile +
            ", hetongText=" + hetongText +
            ", hetongDelete=" + hetongDelete +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
