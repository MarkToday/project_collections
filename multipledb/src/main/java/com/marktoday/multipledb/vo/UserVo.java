package com.marktoday.multipledb.vo;

import com.marktoday.multipledb.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author mark_
 * @className UserVo
 * @description TODO
 * @date 2021/3/30  17:03
 */
@Data
@ApiModel("用户vo")
public class UserVo extends User {
    @ApiModelProperty("用户姓名")
    private String userName;
}
