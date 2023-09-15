abstract class Bank {
public abstract int getBalance();
}
class BankA extends Bank {
private int balance = 0;
public int getBalance() {
balance += 100;
return balance;
}
}
class BankB extends Bank {
private int balance = 0;
public int getBalance() {
balance += 150;
return balance;
}
}
class BankC extends Bank {
private int balance = 0;
public int getBalance() {

balance += 200;
return balance;
}
}
