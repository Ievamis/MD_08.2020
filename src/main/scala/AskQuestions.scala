import scala.io.StdIn.readLine

object AskQuestions extends App {
  val b = 15
  println("Enter your number please :)")
  val c = readLine().toInt
  val answer =
    if (b > c)
      "B is larger than Your Answer"
    else if (c > b)
      "Your Answer is larger than B"
    else "B is equal to Your Answer"
  println(answer)
}
