package apps
// using a a package other scala
// scala.io
import scala.io.Source;

object FileReader extends App {
  val fileRead = Source.fromFile("c:/input/abc.csv");
  val allLines = fileRead.getLines();
  allLines.foreach((line) => {
    val cols = line.split(",");
  });
}