package com.hunter.practise.busi.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author 水木
 * @Date 2019-01-25  10:40
 */
@Data
@ApiModel(value = "CheckUrlReq",description = "测试使用")
public class CheckUrlReq {
    @ApiModelProperty(value = "年龄",required = true,example = "11")
    @NotNull(message="不能为空")
    private int age;

    @ApiModelProperty(value = "姓名",required = true,example = "水木")
    @NotNull(message="不能为空")
    private String name;
}
