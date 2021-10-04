package br.com.springboot2.essentials.requests;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
public class AnimePutRequestBody {
    private Long id;

    @NotEmpty(message = "The anime name cannot be empty")
    private String name;
}
