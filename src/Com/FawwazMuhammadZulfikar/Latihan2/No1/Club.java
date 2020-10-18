package Com.FawwazMuhammadZulfikar.Latihan2.No1;

public class Club {
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int juaraUcl;
    public String deskripsi;

    public Club(String nama){
        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getDataClub1(){
        System.out.println("nama : " + nama);
    }
    public void getDataClub2(){
        System.out.println("nama : " + nama +"\n" +"Deskripsi : " +deskripsi);
    }
    public void getDataClub3(){
        System.out.println("nama : " + nama +"\n"+"tahun berdiri : " + tahunBerdiri +"\n"+"stadion : " + stadion);
    }
    public void getDataClub4(){
        System.out.println("nama : " + nama +"\n"+"tahun berdiri : " + tahunBerdiri +"\n"+"stadion : " + stadion +
                "\n"+"juara UCL : " + juaraUcl +"\n"+"deskripsi : "+deskripsi);
    }
}
