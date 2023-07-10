package tutorial05

object q06 {
  def main(args: Array[String]) {
    def fibonacciSeq(num: Int,int1: Int=0,int2: Int=1) {
      if(num==1) {
        print(int1)
      }
      else if(num==2) {
        println(int1)
        println(int2)
      }
      else {
        println(int1)
        println(int2)
        fibonacciSeq(num-2,int1+int2,int1+2*int2)
      }
    }
    fibonacciSeq(9)
  }
}