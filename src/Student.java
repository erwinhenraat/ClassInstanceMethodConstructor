public class Student {
    private String myName; //member variabele
    public Student(String name){
        //constructor met argument
        myName = name;
        System.out.println("hallo ik ben "+name);
    }
    public void sayHello(){
        System.out.println(myName +" says hello");
    }
}
