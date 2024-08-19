//Driver Class
public class SiswaTester {
    public static void main(String [] args){
        //memmbuat Object
        //namaClass namaObject = new
        //Constructor();
        Siswa arka = new Siswa();
        Siswa altaf = new Siswa();
        Siswa natanz = new Siswa();
        Siswa dewangga = new Siswa();
        Siswa widi = new Siswa();

        arka.id = 17;
        arka.nama = "Arka";
        arka.ipk = 88.9;
        arka.print();
        
        altaf.id = 2;
        altaf.nama = "Altaf";
        altaf.ipk = 28.0;
        altaf.print();

        natanz.id = 27;
        natanz.nama = "Natanz";
        natanz.ipk = 99.9;
        natanz.print();

        dewangga.id = 8;
        dewangga.nama = "Dewangga";
        dewangga.ipk = 88.0;
        dewangga.print();

        widi.id = 16;
        widi.nama = "Widi";
        widi.ipk = 98.0;
        widi.print();

    }
    
}
