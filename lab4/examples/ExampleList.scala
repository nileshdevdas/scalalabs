package examples

// Companion Class
class ExampleList(items: Int*) {
}
/// Companion
object ExampleList {
  // varargs
  def apply(items: Int*) = {
    println(items);
  }
}

// Test Class
object ExampleRunner extends App {
  val a = ExampleList(1, 2, 3, 4, 5, 6);
}