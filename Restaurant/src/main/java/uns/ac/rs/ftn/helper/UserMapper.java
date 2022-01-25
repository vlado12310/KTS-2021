package uns.ac.rs.ftn.helper;


import uns.ac.rs.ftn.dto.UserDTO;
import uns.ac.rs.ftn.model.User;

public class UserMapper implements MapperInterface<User, UserDTO> {

    @Override
    public User toEntity(UserDTO dto) {
        return new User(dto.getEmail(),dto.getPassword());
    }

    @Override
    public UserDTO toDto(User entity) {
        return new UserDTO(entity.getId(), entity.getEmail(),entity.getPassword());
    }
}
