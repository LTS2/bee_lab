package com.bee.beelab.matchv5.model.dto;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author : ejum
 * @fileName : PerkStatsDto
 * @since : 2023/11/23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class PerkStatsDto {

    private int defense;
    private int flex;
    private int offense;

}
