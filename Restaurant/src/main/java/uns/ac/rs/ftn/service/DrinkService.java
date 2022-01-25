package uns.ac.rs.ftn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uns.ac.rs.ftn.model.Drink;
import uns.ac.rs.ftn.repository.DrinkRepository;

import java.util.List;

@Service
public class DrinkService implements ServiceInterface<Drink>{
    @Autowired
    private DrinkRepository drinkRepository;

    @Override
    public List<Drink> findAll() {
        return drinkRepository.findAll();
    }

    @Override
    public Drink findOne(Long id) {
        return drinkRepository.findById(id).get();
    }

    @Override
    public Drink create(Drink entity) throws Exception {
        return drinkRepository.save(entity);
    }

    @Override
    public Drink update(Drink entity, Long id) throws Exception {
        entity.setId(id);
        return drinkRepository.save(entity);
    }

    @Override
    public void delete(Long id) throws Exception {
        drinkRepository.deleteById(id);
    }
}
