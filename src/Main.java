import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        //ik maak een instance van de student class

        Student[] students = {
                new Student("Erwin"),
                new Student("Hendrik"),
                new Student("Marlies")
        };

        for(int i = 0; i < students.length; i++){
            students[i].sayHello();
        }
        for(Student s : students){
            s.sayHello();
        }

        File file = new File("text.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("hoi ");
            pw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        doeWatLeuks();
    }
    private static void doeWatLeuks(){
        System.out.println("leuk leuk!");
    }
}
