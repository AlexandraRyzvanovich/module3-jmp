package com.epam.module3;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;import org.springframework.hateoas.RepresentationModel;

@Data
public class SubscriptionRequestDto extends RepresentationModel<SubscriptionRequestDto> {
    private Long id;
    private Long user_id;

}
