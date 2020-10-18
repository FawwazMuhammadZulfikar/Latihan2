package Com.FawwazMuhammadZulfikar.Latihan2.No2;

public class Burung extends Binatang{
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
        System.out.println("==========Burung==========");
    }
    public void getNama(String getNama){
        System.out.println("Nama hewan\t\t\t\t: " + getNama);
    }
    public void kemampuan(String kemampuan){
        System.out.println("Kemampuan \t\t\t\t: " + kemampuan);
    }
}
