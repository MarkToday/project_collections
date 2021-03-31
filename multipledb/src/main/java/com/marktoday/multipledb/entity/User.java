package com.marktoday.multipledb.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author mark_
 * @className User
 * @description TODO
 * @date 2021/3/30  17:01
 */
@Api("老师实体对象")
@Data
@TableName("t_user")
public class User {
    @ApiModelProperty("用户id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("老师姓名")
    private String userName;

}
