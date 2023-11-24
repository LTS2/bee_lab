package com.bee.beelab.matchv5.model.dto;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author : ejum
 * @fileName : PerkStyleSelectionDto
 * @since : 2023/11/23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class PerkStyleSelectionDto {
    private int perk;
    private int var1;
    private int var2;
    private int var3;
}
