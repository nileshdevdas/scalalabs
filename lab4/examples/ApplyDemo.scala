package examples

object ApplyDemo {

  def apply() {
    println("Wow i was applied !!!!");
  }
}

object ApplyRunner extends App {
  print(ApplyDemo());
}