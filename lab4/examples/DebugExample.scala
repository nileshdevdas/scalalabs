package examples

object DebugExample extends App {

  def add(i: Int, j: Int) = {
    println(i);
    println(j);
    i + j;
  }

  def sub(i: Int, j: Int) = {
    println(j)
    j - i;
  }

  add(1,2);
  sub(2,10)
  
  
}