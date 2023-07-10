package tutorial05

object q05 {
  def main(args: Array[String]) {
    def evenSum(num: Int,int: Int=(-1)): Int = {
      if(num+int==2) {
        return 2
      }
      else if(num+int<2) {
        return 0
      }
      else if((num+int)%2==1) {
        evenSum(num-1,0)
      }
      else {
        return num+int+evenSum(num-1,0)
      }
    }
    println(evenSum(8))
    println(evenSum(2))
    println(evenSum(3))
    println(evenSum(20))
    println(evenSum(9))
  }
}