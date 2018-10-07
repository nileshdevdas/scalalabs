package examples

object ListDemo extends App {

  val users = List("nilesh", "ramesh", "satish", "suresh");
    users.foreach(println);
    // infix     
   val abc = 1 to 10;
   
   abc.foreach((i)=>{println(i)})
 }