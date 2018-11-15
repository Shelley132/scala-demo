object TestArrayBuffer {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer
    val strArrayVal = ArrayBuffer[String]()
    strArrayVal += "Hello"
    strArrayVal += (" World", "P")
    println(strArrayVal)
  }
}
