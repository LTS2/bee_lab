package com.bee.beelab.matchv5.model.dto;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author : ejum
 * @fileName : BanDto
 * @since : 2023/11/23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class BanDto {
    private int championId;
    private int pickTurn;
}
