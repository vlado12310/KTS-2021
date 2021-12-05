package uns.ac.rs.ftn.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDTO {

    private Long id;

    @NotBlank(message = "Email cannot be empty.")
    @Email(message = "Email format is not valid.")
    private String email;

    @NotBlank(message = "Password cannot be empty.")
    private String password;

    public UserDTO() {
    }

    public UserDTO(Long id, @NotBlank(message = "Email cannot be empty.") @Email(message = "Email format is not valid.") String email,
                   @NotBlank(message = "Password cannot be empty.") String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
