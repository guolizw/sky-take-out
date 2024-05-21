package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * @author guolizw
 */
@ApiModel(description = "新增员工传递的数据模型")
@Data
public class EmployeeDTO implements Serializable {


    private Long id;

    @ApiModelProperty("账号")
    private String username;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("手机号码")
    private String phone;

    @ApiModelProperty("姓名")
    private String sex;

    @ApiModelProperty("身份证号")
    private String idNumber;

}
