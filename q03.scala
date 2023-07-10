package tutorial05

object q03 {
  def main(args: Array[String]) {
    def sum(num: Int): Int = {
      if(num==1) {
        return 1
      }
      else {
        return num+sum(num-1)
      }
    }
    print(sum(5))
  }
}