package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@Sql("/sql/test.sql")
public class SchemaTwice5Test {

    @Autowired
    private TestEntityRepository repo;

    @Test
    public void test() {
        System.out.println(repo.findAll());
    }
}
