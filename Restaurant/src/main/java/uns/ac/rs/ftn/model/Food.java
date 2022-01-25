package uns.ac.rs.ftn.model;

import javax.persistence.*;

@Entity
@Table(name = "FOOD_TABLE")
public class Food {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "time")
    private Integer timeToPrepareMin;

    @Column(name = "ingredients")
    private String ingredients;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getTimeToPrepareMin() {
        return timeToPrepareMin;
    }

    public void setTimeToPrepareMin(Integer timeToPrepareMin) {
        this.timeToPrepareMin = timeToPrepareMin;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
