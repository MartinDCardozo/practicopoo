package Practicopoo;

public class Chileno extends Persona {
    private int DNI;
    private String region;
    private String comuna;

    public Chileno(String name, String lastname, int age, String sex, int DNI, String region, String comuna) {
        super(name, lastname, age, sex);
        this.DNI = DNI;
        this.region = region;
        this.comuna = comuna;
    }


    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

}
