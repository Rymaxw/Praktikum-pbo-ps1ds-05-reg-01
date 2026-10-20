package guided.gd2;

public class Manager extends Employee {
    private String alamat;

    public Manager(String nama, String alamat){
        super(nama);
        this.alamat = alamat;
    }

    public void tamplInformasi(){
        super.tampilNama();
        System.out.println("Alamat: " + alamat);
        System.out.println("Departemen: " + super.departemen);
    }
}
