package examples

case class Bank1(name: String) {
}


object CaseClassDemo extends App {

  val bank1 = Bank1("hdfcx");
  val bank2 = Bank1("icici");

  println(bank1 == bank2);

  println(bank1.hashCode);
  println(bank2.hashCode);

  println(bank1);
  println(bank2);

  val xxbank = bank1.copy("xxxxx");
  println(xxbank);

  bank1 match {
    case Bank1("icici") => println("Welcome to icici");
    case Bank1("hdfc") => println("Welcome to hdfc");
  }
}





