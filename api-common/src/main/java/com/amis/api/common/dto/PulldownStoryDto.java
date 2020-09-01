package com.amis.api.common.dto;

import lombok.Data;

@Data
public class PulldownStoryDto {
  private String label;
  private String value;
  private String sprintId;
}
