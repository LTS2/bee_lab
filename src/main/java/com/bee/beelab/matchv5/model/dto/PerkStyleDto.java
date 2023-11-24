package com.bee.beelab.matchv5.model.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : ejum
 * @fileName : PerkStyleDto
 * @since : 2023/11/23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class PerkStyleDto {
    private String description;
    private List<PerkStyleSelectionDto> selections;
    private int style;
}
