package Practicopoo;

public class Uruguayo extends Persona {
    Cedula cedula = new Cedula();

    private String CI=cedula.toString();
    private String Departamento;
    private String Barrio;

    Persona persona = new Persona();


    public Uruguayo(String name, String lastname, int age, String sex, String ci, String departamento, String barrio) {
        super(name, lastname, age, sex);
        CI = ci;
        Departamento = departamento;
        Barrio = barrio;

    }

    public Uruguayo(Cedula cedula, String departamento, String barrio) {
        this.cedula = cedula;
        Departamento = departamento;
        Barrio = barrio;
    }

    public Uruguayo() {

    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }

    public void imprimirInfo(Object p) {
        if(p instanceof Uruguayo){
            System.out.println(((Uruguayo) p).getName());
            System.out.println(((Uruguayo) p).getLastname());
            System.out.println(((Uruguayo) p).getSex());
            System.out.println(((Uruguayo) p).getAge());
            System.out.println(((Uruguayo) p).Departamento);
            System.out.println(((Uruguayo) p).Barrio);
            System.out.println(((Uruguayo) p).getCI());
        }if(p instanceof Chileno){
            System.out.println(((Chileno) p).getName());
            System.out.println(((Chileno) p).getLastname());
            System.out.println(((Chileno) p).getSex());
            System.out.println(((Chileno) p).getAge());
            System.out.println(((Chileno) p).getComuna());
            System.out.println(((Chileno) p).getDNI());
            System.out.println(((Chileno) p).getRegion());
        }
    }
    public void mudarse(Uruguayo uruguayo,String newdepartamento, String newbarrio){
       uruguayo.setDepartamento(newdepartamento);
       uruguayo.setBarrio(newbarrio);
       imprimirInfo(uruguayo);

    }


}

