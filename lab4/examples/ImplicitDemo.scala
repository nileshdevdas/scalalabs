package examples

object ImplicitDemo extends App {

  def add(implicit a: Int) = {
    a * 3.14;
  }
  println(add(10));
}