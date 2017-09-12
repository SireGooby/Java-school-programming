
import java.util.Scanner;

public class HelloWorld
{

  public static void main(String[] args)
  {

    Scanner reader = new Scanner (System.in);
    System.out.println("Hello, User! Please enter your credentials here:");
    String name = reader.next();
    System.out.println("Hello! " + name + ". Please enter your age:");
    int age = reader.nextInt();
    System.out.println("You are of age: " + age + ", Correct?" + "Y/N");
    String YN = reader.next();

    if(age < 10)
    {
      System.out.println("You're a weener get out");
    }

    else 
    {
    String[] info = {"Hello", "World",  Integer.toString(age)};
    for (String infos : info)
    {
      System.out.print(infos);
      System.out.print(",");
    }
  }


  }

}
