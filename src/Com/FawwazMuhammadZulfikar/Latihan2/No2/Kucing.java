package Com.FawwazMuhammadZulfikar.Latihan2.No2;

public class Kucing  extends Binatang{
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
        System.out.println("==========Kucing==========");
    }
    public void getNama(String getNama){
        System.out.println("Nama hewan\t\t\t\t: " + getNama);
    }
    public void suara(String suara){
        System.out.println("Suara\t\t\t\t\t: "+ suara);
    }
}
