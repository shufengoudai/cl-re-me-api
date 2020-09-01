package com.amis.api.common.dto;

import lombok.Data;

@Data
public class PulldownTypeDto {
  private String label;
  private String value;
  private Integer type;
  private String typeName;
}
