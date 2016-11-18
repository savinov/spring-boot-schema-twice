package test;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
public class TestEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    private Long value;

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
