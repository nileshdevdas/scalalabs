package examples

object LazyValsDemo extends App {

  lazy val a = {
    println("This will execute only once");
    // i dont need a return statement
    10;
  }

  println(a);
  println(a);
}
