public class Main {
    public static void main(String[] args) {
      Employee emrah = new Employee("Emrah",5500,42,2021);
      emrah.bonus();
      emrah.raiseSalary();
      emrah.printOut();
      Employee mahmut = new Employee("Mahmut",900,75,1990);
      mahmut.bonus();
      mahmut.raiseSalary();
      mahmut.printOut();
    }
}
