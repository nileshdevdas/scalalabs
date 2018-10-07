package examples

class ClassDemo(val a: Int) {
  // even if you are defining aux constrcutor
  def this() {
    // make a call to the primary constructor
    this(1);
  }

  def print() {

  }
}

// Subclassing
// with mulitple inheritence
class NewClassDemo extends ClassDemo(1) with AuditTrait {
  // overriden method
  override def print() {
    // parent class method
    super.print();
  }
}

object ClassTester extends App {

  val myclass = new ClassDemo(10);
  println(myclass.a);

}