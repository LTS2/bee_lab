package com.bee.beelab.matchv5.model.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : ejum
 * @fileName : MetadataDto
 * @since : 2023/11/23
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class MetadataDto {

    private String dataVersion;
    private String matchId;
    private List<String> participants;
}
