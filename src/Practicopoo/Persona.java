package Practicopoo;

public class Persona implements SerVivo {

    public Persona(String name, String lastname, int age, String sex) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
    }

    public Persona() {}

    public static void main(String[] args) {
        Uruguayo uruguayo = new Uruguayo("Rodolfo", "Suarez", 25,
                "M","Montevideo","Flores","La Figurita" );
        Chileno chileno = new Chileno("Rodrigo","Lopez",12,"M",11234567,
                "Atacama","Chañaral");
        Perro pupi = new Perro("pupi", "bulldog frances", 12, "hembra");
        Persona persona = new Persona();
        persona.soychilenoouruguayo(uruguayo);
        persona.esAdulto(chileno);
        persona.esAdulto(pupi);
        persona.birthday(pupi);
        Uruguayo uruguayo1 = new Uruguayo();
        uruguayo1.imprimirInfo(chileno);
        uruguayo1.mudarse(uruguayo,"Artigas","lalala");



    }

    public boolean soychilenoouruguayo(Object persona) {
        if (persona instanceof Uruguayo) {
            System.out.println(true);
        }
        if (persona instanceof Chileno) {
            System.out.println(true);
        }
        return false;
    }


    private String name;
    private String lastname;
    private int age;
    private String sex;


    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setsex(String sex) {
        this.sex = sex;
    }


    public boolean esAdulto(Object someone){
        if(someone instanceof Perro){
            System.out.println(((Perro) someone).getAge()>=18);
        }if(someone instanceof Persona){
            System.out.println(((Persona) someone).age>=18);
        }
        return false;
    }

    public int birthday(Object alguien){
        if(alguien instanceof Persona){
            System.out.println(((Persona) alguien).age+1);
        }if(alguien instanceof Perro){
            System.out.println(((Perro) alguien).getAge()+1);
        }
        return 0;
    }



}