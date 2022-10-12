package com.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Faye
 * @since 2022-10-12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户编码
     */
    @TableField("code")
    private String code;

    /**
     * 用户名（登录用）
     */
    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    /**
     * 电话号码
     */
    @TableField("telephone")
    private String telephone;

    /**
     * 性别，F:女，M：男
     */
    @TableField("gender")
    private String gender;

    /**
     * 昵称（展示用）
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 状态，0：停用，1：启用
     */
    @TableField("status")
    private Integer status;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;


}
