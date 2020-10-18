package Com.FawwazMuhammadZulfikar.Latihan2.No2;

public class Ikan extends Binatang {
    @Override
    public void makan(String maem) {
        super.makan(maem);
        System.out.println(""+maem);
    }
    @Override
    public void tidur(String bobo) {
        super.tidur(bobo);
        System.out.println(""+bobo);
    }

    public void nama(){
        System.out.println("==========Ikan==========");
    }
    public void getNama(String getNama){
        System.out.println("Nama Hewan\t\t\t\t: " +getNama);
    }
    public void kemampuan(String kemampuan){
        System.out.println("kemampuan\t\t\t\t: " +kemampuan);
    }
}
