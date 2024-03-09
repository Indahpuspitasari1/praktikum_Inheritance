package percobaan_2;
class Pegawai {
    public String nama;
    public double gaji;
}

class Manajer extends Pegawai {
    public String departemen;
    
    public void IsiData(String n, String d){
        nama=n;
        departemen=d;
    }
}
public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();
        pegawai.nama = "Indah Puspitasari ";
        pegawai.gaji = 2000000000;
        System.out.println("Nama: " + pegawai.nama);
        System.out.println("Gaji: " + pegawai.gaji);
    }
}

