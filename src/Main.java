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

        doeWatLeuks();
    }
    private static void doeWatLeuks(){
        System.out.println("leuk leuk!");
    }
}
