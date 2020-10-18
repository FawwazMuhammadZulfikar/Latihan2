package Com.FawwazMuhammadZulfikar.Latihan2.No2;

public class DemoBinatang {
    public static void main(String[] args) {
        System.out.println();
        Burung burung = new Burung();
        burung.nama();
        burung.getNama("Garuda");
        burung.makan("Kacang");
        burung.tidur("Kalo ngantuk tidur doi");
        burung.kemampuan("Terbang");

        System.out.println();

        Ikan ikan = new Ikan();
        ikan.nama();
        ikan.getNama("Nimo");
        ikan.makan("Plankton");
        ikan.tidur("Mana saya tau, saya kan manusia");
        ikan.kemampuan("Berenang");

        System.out.println();

        Kucing kucing = new Kucing();
        kucing.nama();
        kucing.getNama("Anggora");
        kucing.makan("ikan");
        kucing.tidur("Kalo malem sih tidur keknya");
        kucing.suara("Meong");
    }
}
