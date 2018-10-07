package examples

object ADemo extends App {

  val b = new AuditTrait(){};
  println(b.log());
  println(b);

}