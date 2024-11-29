package co.imp.tech.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentResponseDto {
    private Long id;
    private String content;
    private String title;
    private String approvedBy;
    private LocalDateTime approvalDate;
}
