public class Main {
public static void main(String[] args) {
BankA bankA = new BankA();
BankB bankB = new BankB();
BankC bankC = new BankC();
System.out.println("Bank A balance: " + bankA.getBalance()); // Output: Bank A balance:
System.out.println("Bank B balance: " + bankB.getBalance()); // Output: Bank B balance:
System.out.println("Bank C balance: " + bankC.getBalance()); // Output: Bank C balance:
}
}