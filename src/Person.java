public class Person {
    private String name="Aboba";
    private int age=19;
    private int age1=19;
    private int age2=19;
    private int age3=19;
    private int age4=19;
    private int age5=19;
    private int age6=19;
    private int age7=19;


    public void info_house1() {

        System.out.println("Name: " + name + " Age: " + age);
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

    public Person(String name, int age, int age1, int age2, int age3, int age4, int age5, int age6, int age7) {
        this.name = name;
        this.age = age;
        this.age1 = age1;
        this.age2 = age2;
        this.age3 = age3;
        this.age4 = age4;
        this.age5 = age5;
        this.age6 = age6;
        this.age7 = age7;
    }
}
