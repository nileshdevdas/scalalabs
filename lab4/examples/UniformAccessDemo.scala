package examples

class Bank {
  val a = 10;
  var b = 10;
  def c() = {

    100;
  }
}

object BankTester extends App {
  val bank = new Bank();
  println(bank.a);
  println(bank.b);
  println(bank.c);
}

