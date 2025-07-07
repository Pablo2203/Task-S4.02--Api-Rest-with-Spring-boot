package cat.itacademy.s04.t02.n01.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fruits")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int weightKg;

    public Fruit() {}

    public Fruit(String name, int weightKg) {
        this.name = name;
        this.weightKg = weightKg;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeightKg() {
        return weightKg;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeightKg(int weightKg) {
        this.weightKg = weightKg;
    }
}
