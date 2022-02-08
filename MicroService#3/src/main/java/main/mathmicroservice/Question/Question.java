package main.mathmicroservice.Question;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sergey Serdyuk
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private String question;
    private String answer;
}
