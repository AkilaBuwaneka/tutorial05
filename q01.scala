package tutorial05

import java.lang.Boolean

object q01 {
  def main(args: Array[String]) {
    def prime(num: Int,int: Int = 2): Boolean = {
      if(num<2) {
        return false
      }
      else if(num==2) {
        return true
      }
      else if(int*int>num) {
        return true
      }
      else if(num%int==0) {
        return false
      }
      else {
        return prime(num,int+1)
      }
    }
    println(prime(5))
    println(prime(8))
  }
}