package examples

object VarVsVal extends App {

  var a = 10;

  a = 20;

  val b = 10;
  /// this is not allowed in scala as its immutable
  //b = 20;

}