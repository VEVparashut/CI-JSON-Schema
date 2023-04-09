public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 100_060;
    boolean registered = true;
    long expected = 500;

    service.calculate(amount, registered);


  }
}

