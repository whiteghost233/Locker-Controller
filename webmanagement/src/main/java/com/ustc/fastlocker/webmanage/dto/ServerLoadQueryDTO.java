package com.ustc.fastlocker.webmanage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerLoadQueryDTO {
    Integer serverId;
    String date;
}
