package cat.itacademy.s04.t02.n01.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruits")
public class Fruit {
    @Id
    private String id;
    private String name;
    private int weightKg;

    public Fruit() {}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }

    public Fruit(String name, int weightKg) {
        this.name = name;
        this.weightKg = weightKg;
    }

}
