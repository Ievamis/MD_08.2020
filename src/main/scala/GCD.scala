object GCD extends App {
var i = 0
  while (i < 10) {
    println(i)
    i+=1 //i = i + 1
  }
  var sum = 0.toLong
  i = 0
  val max = 1000000000.toLong
  while (i <= max) {
    sum += i
    i+= 1
  }
  println(s"Sum of numbers up to and including $max is $sum")
  println(s"Lazy Gauss would have solved it like this ${max*(max+1)/2})")
}
