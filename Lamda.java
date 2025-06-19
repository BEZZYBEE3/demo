import java.util.ArrayList;

public class Lamda {
  public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>();
    num.add(5);
    num.add(67);
    num.add(5
    );
    System.out.println(num);
    num.forEach((n) -> System.out.println(n));
    
  }
}
