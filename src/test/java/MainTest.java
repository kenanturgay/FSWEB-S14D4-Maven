import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;
import org.example.rpg.Monster;
import org.example.rpg.Troll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Method;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    ProductForSale bread;
    ProductForSale chocolate;
    ProductForSale coke;

    Monster troll;

    @BeforeEach
    void setUp() {
        bread = new Bread("Test", 10, 100, "bread");
        chocolate = new Chocolate("Test", 10, 100,"Test Chocolate");
        coke = new Coke("Test", 10, 100, "Test Coke");
        troll = new Troll(100, 1000, "Shrek");
    }

    @DisplayName("Subclasslar Superclass değişkenlerinin değerlerine ulaşabiliyor mu?")
    @Test
    public void testProductForSaleAccessModifiers() throws NoSuchFieldException {
        assertEquals(bread.getType(), 10);
        assertEquals(bread.getPrice(), 100);
        assertEquals(bread.getDescription(), "Test");

        assertEquals(chocolate.getType(), 10);
        assertEquals(chocolate.getPrice(), 100);
        assertEquals(chocolate.getDescription(), "Test");
    }

    @DisplayName("Tüm sınıflar doğru sınıftan türüyorlar mı?")
    @Test
    public void testLampAccessModifiers() throws NoSuchFieldException {
        assertThat(bread, instanceOf(ProductForSale.class));
        assertThat(chocolate, instanceOf(ProductForSale.class));
        assertThat(coke, instanceOf(ProductForSale.class));
    }

    @DisplayName("getSalesPrice doğru sonuçlar üretiyor mu?")
    @Test
    public void testGetSalesPrice() throws NoSuchFieldException {
        assertEquals(bread.getSalesPrice(3), 300);
        assertEquals(chocolate.getSalesPrice(5), 500);
        assertEquals(coke.getSalesPrice(4), 400);
    }

    @DisplayName("showDetails methodu tanımlanmış mı?")
    @Test
    public void testShowDetails() throws NoSuchMethodException {
        Method showDetailsMethod = bread.getClass().getDeclaredMethod("showDetails");
        assertEquals(showDetailsMethod.getModifiers(), 1);
    }

    @DisplayName("Troll sınıfı doğru değişkenlere tiplerine sahip mi ?")
    @Test
    public void testTrollDataTypes() throws NoSuchFieldException {
        assertThat(troll.getName(), instanceOf(String.class));
        assertThat(troll.getHitPoints(), instanceOf(Integer.class));
        assertThat(troll.getDamage(), instanceOf(Double.class));

        assertEquals(troll.getName(), "Shrek");
        assertEquals(troll.getHitPoints(), 1000);
        assertEquals(troll.getDamage(), 100);
    }

    @DisplayName("attack methodu doğru çalışıyor mu ?")
    @Test
    public void testAttackMethod() {
       assertEquals(troll.attack(), 155.0);
    }
}
