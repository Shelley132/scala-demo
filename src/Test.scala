object Test {
  def main(args: Array[String]): Unit = {
    println("Returned value:" + addInt(5, 7));
    val s = "testtest"
    println(s.length())
    println(multiplier(1))
  }

  def addInt(i: Int, i1: Int): Int = {
    var sum: Int = 0
    sum = i + i1
    return sum
  }
  var factor =3
  var multiplier = (i:Int)=>i*factor
}
