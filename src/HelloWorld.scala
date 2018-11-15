import Array._

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val s = new Array[Int](3)
    s(0) = 12
    s(1) = 11
    s(4 / 2) = 10
    for (i <- s) {
      println(i)
    }

    val myList = ofDim[Int](3,3)

    for(i <- 0 to 2){
      for(j <- 0 to 2){
        myList(i)(j)= i*j
      }
    }
    for(i <- myList){
      for(j <- i){
        println(j)
      }
    }
  }
}