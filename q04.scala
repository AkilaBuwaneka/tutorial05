package tutorial05

object q04 {
  def main(args: Array[String]): Unit = {
    //Using Indirect Recursive (Mutual Recursion)

    def isEven(number: Int): Boolean = number match {
      case 0 => true
      case _ => isOdd(number-1)
    }

    def isOdd(number:Int): Boolean = number match {
      case 0 => false
      case _ => isEven(number-1)
    }

    println(isEven(5))
    println(isEven(8))
  }
}