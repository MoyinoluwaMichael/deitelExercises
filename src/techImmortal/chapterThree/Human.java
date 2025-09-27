package techImmortal.chapterThree;


public class Human {

    private String name = null;
    private int age = 0;
    private int height;
    private String email;

//No args constructor
    public Human() {
        this.name = null;
        this.age = 0;
    }

//    Required args constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0;
        this.email = null;
    }

//    All args constructor
    public Human(String name, int age, int height, String email) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.email = email;
    }

//    getter
    public String getName() {
        return this.name;
    }

//    setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }


}
