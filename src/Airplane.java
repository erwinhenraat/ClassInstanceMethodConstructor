import java.util.Random;

public class Airplane {
    private String myFlightCode;
    private int myPassengers;
    public Airplane(int passengers, String flightCode){
        //constructor
        myFlightCode = flightCode;
        myPassengers = passengers;

    }
    private boolean alive = true;
    public void fly(){
        if(alive) {
            System.out.println("jeeeeeeeyyhaaaaaaw!!");
        }
    }
    public void crash(){
        System.out.println("aww F&*K!!!");
        System.out.println("flight "+ myFlightCode+" went down. " + myPassengers + " people died!");
        alive = false;

    }
    public boolean checkForDanger(){
        int r = new Random().nextInt(5);
        System.out.println(r);
        if(r < 2)return true;

        return false;
    }
}
