package cat.itacademy.s04.t02.n01.services;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FruitService {
    @Autowired
    private FruitRepository fruitRepository;

    public Fruit addFruit (Fruit fruit){
        return fruitRepository.save(fruit);
    }
   public Fruit updateFruit (Fruit fruit){
        return fruitRepository.save(fruit);
    }
    public void deleteFruit (String id){

        fruitRepository.deleteById(id);
    }
    public Fruit getOneFruit (String id){
        return fruitRepository.findById(id).orElse(null);
    }
    public Iterable<Fruit> getAllFruit (){
        return fruitRepository.findAll();
    }



}
