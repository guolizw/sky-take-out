package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author guolizw
 * @date 2024/05/22
 */
@Data
@ApiModel(description = "员工页面分页查询传递的数据")
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    @ApiModelProperty("姓名")
    private String name;

    //页码
    @ApiModelProperty("页码")
    private int page;

    //每页显示记录数
    @ApiModelProperty("每页显示的记录数")
    private int pageSize;

}
