package bean;

/**
 * Created by teng.liu on 2017/8/13.
 */
public class People {

    private String name;

    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;

        if (age != people.age) return false;
        return name != null ? name.equals(people.name) : people.name == null;
    }


    @Override
    public int hashCode() {
        return age;  // only for test
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
