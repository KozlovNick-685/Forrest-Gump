import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    void test1() {
        MyHashSet<Visitor> visitors = new MyHashSet<>();

        //регистрация
        Visitor vasya = new Visitor("Василий", "123");
        visitors.add(vasya);

        Assertions.assertTrue(visitors.contains(vasya));

        vasya.setPassId("999");

        Assertions.assertTrue(visitors.contains((vasya)));
    }

    // Последний вызов вернул false
    // Потому что с изменением passId изменился и хэш-код
    // У нас объект вроде бы тот же самый, но MyHashSet ищет
    // с другим ключом


    // Аня, дальше я не делал дз, потому что ничего не могу понять.
    // с дипсика списывать не хочу. А то, что он мне генерит, содержит неприличное кол-во
    // материала, который я вижу первый раз.

}
