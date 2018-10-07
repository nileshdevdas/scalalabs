package examples

object MethodsDemo extends App {

  def methodName(a: Int) = {

    10 * a;
  }

  def methodWithParams(a: Int = 10) = {
    // if you dont pass the value
    10 * a;
  }

  println(methodName(10))

  // valid invocation // infix ivocation
  println(this methodWithParams 10);

  def methodWithParamNames(firstName: String, lastName: String) = {
    firstName.concat(" ").concat(lastName);
  }

  println(methodWithParamNames(lastName = "Devdas", firstName = "Nilesh"));

  def methodX() = {
    1000;
  }
  
  print(methodX);

}