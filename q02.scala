package tutorial05

object q02 {
  def main(args: Array[String]): Unit = {
    def isPrime(number :Int, i :Int): Boolean ={
      if(i==1){
        return true
      }else{
        if(number%i==0){
          return false
        }else{
          return isPrime(number,i-1)
        }
      }
    }

    def primeSeq(number :Int): Unit ={
      if(number>2){
        primeSeq(number-1)
        if(isPrime(number,number/2) && number !=13){
          println(number)
        }
      }else if(number==2){
        println(number)
      }

    }

    primeSeq(13)
  }
}