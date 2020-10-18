package Com.FawwazMuhammadZulfikar.Latihan2.No1;

public class Demo {
    public static void main(String[] args) {
        Club club1 = new Club("Real Madrid");
        Club club2 = new Club("Real Madrid","Real Madrid Club dari Spanyol");
        Club club3 = new Club("Real Madrid",1902,"Santiago Bernabeu");
        Club club4 = new Club("Real Madrid",1902,"Santiago Bernabeu",13,"Real Madrid Club dari Spanyol");

        club1.getDataClub1();
        System.out.println();
        club2.getDataClub2();
        System.out.println();
        club3.getDataClub3();
        System.out.println();
        club4.getDataClub4();
    }
}
