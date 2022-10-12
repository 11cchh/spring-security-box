package com.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户机构关联表
 * </p>
 *
 * @author Faye
 * @since 2022-10-12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user_organization")
public class UserOrganization implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户编码
     */
    @TableField("user_code")
    private String userCode;

    /**
     * 机构编码
     */
    @TableField("org_code")
    private String orgCode;


}
