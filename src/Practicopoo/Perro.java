package Practicopoo;

public class Perro implements SerVivo{
    private String name;
    private String breed;
    private int age;
    private String sex;

    public Perro(String name, String breed, int age, String sex) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public int birthday(Object someone){
        return 0;
    }

    @Override
    public boolean esAdulto(Object someone) {
        return false;
    }
}

