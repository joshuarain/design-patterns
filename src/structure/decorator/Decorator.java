package structure.decorator;

/**
 * @author Lenovo
 * @title: Decorator
 * @projectName DesignPattern
 * @description: TODO
 * @date 2019/8/13 14:17
 */
public class Decorator implements Person {
    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
