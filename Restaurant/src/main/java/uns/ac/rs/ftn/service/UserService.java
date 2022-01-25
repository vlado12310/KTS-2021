package uns.ac.rs.ftn.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uns.ac.rs.ftn.model.Authority;
import uns.ac.rs.ftn.model.User;
import uns.ac.rs.ftn.repository.UserRepository;

import java.util.List;

@Service
public class UserService implements ServiceInterface<User> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthorityService authService;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOne(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User create(User entity) throws Exception {
        if(userRepository.findByEmail(entity.getEmail()) != null){
            throw new Exception("User with given email address already exists");
        }
        User u = new User();
        u.setUsername(entity.getUsername());
        // pre nego sto postavimo lozinku u atribut hesiramo je
        u.setPassword(passwordEncoder.encode(entity.getPassword()));
        u.setFirstName(entity.getFirstName());
        u.setLastName(entity.getLastName());
        u.setEmail(entity.getEmail());

        List<Authority> auth = authService.findByName("ROLE_BARTENDER");// tu dodati sta treba
        // u primeru se registruju samo obicni korisnici i u skladu sa tim im se i dodeljuje samo rola USER
        u.setAuthorities(auth);

        u = this.userRepository.save(u);
        return u;
    }

    @Override
    public User update(User entity, Long id) throws Exception {
        User existingUser =  userRepository.findById(id).orElse(null);
        if(existingUser == null){
            throw new Exception("User with given id doesn't exist");
        }
        existingUser.setPassword(entity.getPassword());
        return userRepository.save(existingUser);
    }

    @Override
    public void delete(Long id) throws Exception {
        User existingUser = userRepository.findById(id).orElse(null);
        if(existingUser == null){
            throw new Exception("User with given id doesn't exist");
        }
        userRepository.delete(existingUser);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
