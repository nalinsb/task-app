package lk.ijse.dep9.app.dto;

import com.sun.source.doctree.SerialDataTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
        @NotBlank(message = "FullName can't be empty or null")
        @Pattern(regexp = "^[A-Za-z ]+$")
        private String fullName;
        @NotBlank(message = "username can't be empty or null")
        private String username;
        @NotEmpty(message = "Password can't be empty or null")
        @Length(min = 3, message = "Password should be at least 3 characters long")
        private String password;

}
