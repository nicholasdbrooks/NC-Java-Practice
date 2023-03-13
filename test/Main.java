package test;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  // initialize vars
  private int age;
  String fname;
  String lname;

  // constructor method - creating a new object calls this method!!
  // constructor name must match the class name, and it cannot have a return type 
  public Main(int inage, String infname, String inlname) {
    this.age = inage;
    fname = infname;
    lname = inlname;
  }

  // if the method will be called WITHOUT an object, it must be static!!!
  static void getcrunk() {
    System.out.println("Oh yeah get crunk with it");
  }

  // if the method will be called by the Object, it must be public!!!!!
  public void whoareyou() {
    System.out.println("Who am I? I'm goddamn " + fname + " " + lname + " you son of a bitch.");
  } 
  public static void main(String[] args) {
    // commenting out on ya
    getcrunk();

    ArrayList<String> teams = new ArrayList<String>();
    teams.add("Trail Blazers");
    teams.add("Mariners");
    teams.add("Beavers");
    System.out.println(teams);
    System.out.println(teams.get(1));
    
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    int userage = input.nextInt();
    input.close();


    Main person = new Main(userage, "Thermite", "Windbreaker");
    person.whoareyou();
    System.out.println("That's right you limey little twat. Don't you know that " + person.fname + " is a " + person.age + " years old ball of pure muscular rage?");
  }
}