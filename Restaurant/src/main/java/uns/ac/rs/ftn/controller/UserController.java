package uns.ac.rs.ftn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import uns.ac.rs.ftn.dto.UserDTO;
import uns.ac.rs.ftn.helper.UserMapper;
import uns.ac.rs.ftn.model.User;
import uns.ac.rs.ftn.service.UserService;

import java.util.ArrayList;
import java.util.List;

//@RestController -> anotacija kojom se oznacava da je ovaj Spring kontejner zaduzen za prihvatanje klijentskih zahteva i slanje odgovora
@RestController
//@RequestMapping anotacija se može navesti i na nivou klase – tada sve metode unutar kontrolera imaju u svom URL-u prefiks koji je definisan u toj anotaciji
@RequestMapping(value =  "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    private UserMapper userMapper;

    // Metode klase kontrolera su anotirane sa @RequestMapping anotacijom koja opisuje zahtev koji treba biti obrađen u toj metodi (URL i tip HTTP metode)
    /* ResponseEntity objekat može da sadrži:
            telo (podatke) – metode anotirane sa @RequestBody anotacijom sadrže samo telo
            zaglavlje (metapodatke)
            HTTP status kod
    */
    //pos@PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<User> users = userService.findAll();

        return new ResponseEntity<>(toUserDTOList(users), HttpStatus.OK);
    }

    //Parametar je u kontroler moguce poslati kao parametar koji je promenljiva u URL-u zahteva - Path Variable
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id){
        User user = userService.findOne(id);
        if(user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userMapper.toDto(user), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value="/{id}", method= RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id){
        User user;
        try {
            user = userService.update(userMapper.toEntity(userDTO), id);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(userMapper.toDto(user), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value="/{id}", method= RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        try {
            userService.delete(id);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    public UserController() {
        userMapper = new UserMapper();
    }

    private List<UserDTO> toUserDTOList(List<User> users){
        List<UserDTO> userDTOS = new ArrayList<>();
        for (User user: users) {
            userDTOS.add(userMapper.toDto(user));
        }
        return userDTOS;
    }
}
