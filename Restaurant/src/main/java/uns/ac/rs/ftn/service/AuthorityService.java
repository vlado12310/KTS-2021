package uns.ac.rs.ftn.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uns.ac.rs.ftn.model.Authority;
import uns.ac.rs.ftn.repository.AuthorityRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;


    public List<Authority> findById(Long id) {
        Optional<Authority> auth = this.authorityRepository.findById(id);
        List<Authority> auths = new ArrayList<>();
        auths.add(auth.get());
        return auths;
    }

    public List<Authority> findByName(String name) {
        Authority auth = this.authorityRepository.findByName(name);
        List<Authority> auths = new ArrayList<>();
        auths.add(auth);
        return auths;
    }
}
