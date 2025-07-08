package cat.itacademy.s04.t02.n01.controllers;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public Fruit addFruit (@RequestBody Fruit fruit){
        return fruitService.addFruit(fruit);
    }

    @PutMapping("/update")
    public Fruit updateFruit (@RequestBody Fruit fruit){
        return fruitService.updateFruit(fruit);
    }

    @DeleteMapping("/delete")
    public void deleteFruit (@PathVariable String id){
        fruitService.deleteFruit(id);
    }

    @GetMapping("/getOne")
    public Fruit getOneFruit (@PathVariable String id){
        return fruitService.getOneFruit(id);
    }

    @GetMapping("/getAll")
    public Iterable<Fruit> getAllFruit (){
        return fruitService.getAllFruit();
    }


   /* http://localhost:8080/fruit/add
    http://localhost:8080/fruit/update
    http://localhost:8080/fruit/delete/{id}
    http://localhost:8080/fruit/getOne/{id}
    http://localhost:8080/fruit/getAll*/
}
