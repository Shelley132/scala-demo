object TestMap {
  def main(args: Array[String]): Unit = {
    var A:Map[Char, Int] = Map()
    val colors = Map("red" ->"#FF0000", "azure"->"F0FFFF")
    val cars = Map("Dazhong"->20, "Hongqi"-> 10)
    println(colors)
    println(colors.contains("azure"))
    println(colors.contains("black"))
    println(colors.equals(cars))
    println(cars.equals(cars))
  }
}
