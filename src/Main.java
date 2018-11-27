public class Main{
    public static void main(String[]args){
        //instance aanmaken van Airplane class
        //dat is dus ap1
        //dit noem je ook wel instantieren
        Airplane ap1 = new Airplane(122, "mh18");
        Airplane ap2 = new Airplane(254, "zs25");

        //aanroepen van de fly methode van de Airplane class
        ap1.fly();
        ap2.fly();
        ap1.crash();
        ap1.fly();
        ap2.fly();
    }

}