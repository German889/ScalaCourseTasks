package tasks.solutions

import scala.annotation.tailrec
object HomeWork{
  def main(args: Array[String]):Unit = {
    //1 lecture
    //1
    println(getSquare(2))
    println(getSquare(13))
    println(getSquare(6.84))
    //2
    println(getArea(45.9))
    //3
    println(converterCtoF(23))
    //4
    println("str".length)
    //5
    println(distance(Point(3.23, 4.25),Point(5.65,7.87)))
    //2 lecture
    //1
    println(parity(4))
    println(parity(5))
    println(parity(8))
    //2
    println(sign(-16))
    //3
    println(getTO10())
    println(getUNTIL10())
    //4
    getTable()
    //5
    for(i <- 1 to 10){
      println(fib(i))
    }
    for (i <- 1 to 10) {
      println(fibTail(i))
    }
  }
  //1
  def getSquare(a:Double): Double = {
    val b = a*a;
    b;
  }
  //2
  def getArea(a: Double): Double = {
    val b = 2*a
    b
  }
  def converterCtoF(t: Double):Double = {
    9/5*t + 32
  }
  def distance(p1:Point, p2:Point):Double = {
    math.sqrt(getSquare(p2.getX()-p1.getX())+getSquare(p2.getY()-p1.getY()))
  }
  def parity(a:Int):Boolean = {
    if (a % 2 == 0) true else false
  }
  def sign(a:Int):String = {
    if(a==0) {
      return "zero"
    }else if(a>0) {
      return "positive"
    }else{return "negative"}
  }
  def getTO10():List[Int] = {
    (1 to 10).toList
  }

  def getUNTIL10(): List[Int] = {
    (1 until 10).toList
  }

  def getTable(): Unit = {
    for (i <- 1 to 10) {
      println("5 * " + i + " = " + (5 * i))
    }
  }
  def fib(n: Int): Int = {
    if (n <= 1) n
    else {
      val temp = fib(n - 1)
      val result = fib(n - 2)
      result + temp
    }
  }
  @tailrec
  def fibTail(n: Int, a: Int = 0, b: Int = 1): Int = {
    if (n == 0) a
    else fibTail(n - 1, b, a + b)
  }

}
case class Point(X: Double, Y: Double) {
  def getX(): Double = X

  def getY(): Double = Y
}
