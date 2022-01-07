package ir.ali.springboot.webapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    //define field

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "weight")
    private float weight;

    @Column(name = "value")
    private int value;

    //define constructor

    public Product() {
    }

    public Product(float weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    //define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //define tostring
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", weight=" + weight +
                ", value=" + value +
                '}';
    }
}
