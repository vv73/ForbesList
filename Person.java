package itschool.samsung.ru.test2;

/**
 * Created by vv on 04.05.2017.
 */
public class Person {
    String name;
    int flag_res; // имя ресурса флага
    String money; // состояние в строковом формате

    public Person(String name, String money, int flag_res) {
        this.flag_res = flag_res;
        this.money = money;
        this.name = name;
    }
}
