package uns.ac.rs.ftn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;
import uns.ac.rs.ftn.model.Food;
import uns.ac.rs.ftn.repository.FoodRepository;

import java.util.List;

@Service
public class FoodService implements ServiceInterface<Food> {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Food findOne(Long id) {
        return foodRepository.findById(id).get();
    }

    @Override
    public Food create(Food entity) throws Exception {
        return foodRepository.save(entity);
    }

    @Override
    public Food update(Food entity, Long id) throws Exception {
        entity.setId(id);
        return foodRepository.save(entity);
    }

    @Override
    public void delete(Long id) throws Exception {
        foodRepository.deleteById(id);
    }
}
