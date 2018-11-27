public class Main{
    public static void main(String[]args){
        //instance aanmaken van Airplane class
        //dat is dus ap1
        //dit noem je ook wel instantieren
        Airplane[] airplanes = {
                new Airplane(300, "AX33"),
                new Airplane(277,"BG32"),
                new Airplane(227,"GG55"),
                new Airplane(188,"FD14"),
                new Airplane(22,"FX34")
        };

        //aanroepen van de fly methode van de Airplane class

        for (Airplane a: airplanes) {
            a.fly();
            if(a.checkForDanger()){
                a.crash();
            }
        }
    }

}
