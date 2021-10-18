package com.betheve.BeTheVe.restaurant;

import io.swagger.annotations.ApiModelProperty;

import lombok.Data;

@Data
public class Request {
    @ApiModelProperty(value="가게 이름", example = "비건식당", required = true)
    private String name;

    @ApiModelProperty(value="업종", example = "한식", required = true)
    private String restaurantCode;

    @ApiModelProperty(value="연락처", example = "01012345678", required = true)
    private String phoneNum;

    @ApiModelProperty(value="지역", example = "영등포구", required = true)
    private String location;

    @ApiModelProperty(value="상세주소", example = "양평동 123", required = true)
    private String address;

}
