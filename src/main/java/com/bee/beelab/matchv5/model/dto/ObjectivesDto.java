package com.bee.beelab.matchv5.model.dto;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author : ejum
 * @fileName : ObjectivesDto
 * @since : 2023/11/23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class ObjectivesDto {

    private ObjectiveDto baron;
    private ObjectiveDto champion;
    private ObjectiveDto dragon;
    private ObjectiveDto inhibitor;
    private ObjectiveDto riftHerald;
    private ObjectiveDto tower;
}
