package org.example.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserForm {
    private String id;
    private String password;
    private String name;
    private String email;
}
