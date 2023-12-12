import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Constraint;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;
import javax.validation.executable.ValidateOnExecution;
import javax.xml.validation.Validator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InputModel {
    @NotNull(message = "Missing Input")
    @Size(max = 2000, min = 1 , message = "Invalid Input length")
    @Pattern(regexp = "^(([a-z]|[(]+[a-z]+[)])+)$" ,message="Enter lower case English characters and parentheses")
    private  @Valid String inputString;


}
