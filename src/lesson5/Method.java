package lesson5;

public class Method {
  int summ(int a, int b, int c) {
    int result = a + b + c;
    return result;
  }
}


class Execution {
  public static void main(String[] args) {

    Method t = new Method();

    int threeNums = t.summ(5, 3, 10);
    System.out.println(threeNums);

  }

}


