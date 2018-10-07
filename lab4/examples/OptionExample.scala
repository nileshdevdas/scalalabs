package examples

class Login(username: String, password: String, val domain: Option[String])
object OptionExample extends App {

  val login1 = new Login("nilesh", "passsword", None);
  val login2 = new Login("nilesh", "passsword", Some("admin"));

  println(login1.domain.getOrElse("No Domain"))
  println(login2.domain.getOrElse("No Domain"))

//  val thedomain = login2.domain match {
//    case Some(arg1) => arg1;
//    case None => " Default Value "
//  }
}