object ListTest1 {
  val site: List[String] = List("a", "b", "c")
  val nums: List[Int] = List(1, 2, 3, 4)
  val empty: List[Nothing] = List()
  val dim: List[List[Int]] =
    List(
      List(1, 2, 3),
      List(2, 3, 4),
      List(3, 4, 5)
    )
  val empty2 = Nil
  val dim2 = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil


  def main(args: Array[String]): Unit ={
    val site = "a"::("b"::("c"::Nil))
    val nums = Nil
    println(site.head)
    println(site.tail)
    println(site.isEmpty)
    println(nums.isEmpty)
    println(dim2.size)
    println(dim2.head)

    val f = site.:::(dim2)
    val f2 = site.:::(f)
    println(f)
    println(f2)


    val site2 = List.fill(3)("ddd")
    println(site2)
    //一维列表
    val site3 = List.tabulate(6)(n=>n*n)
    println(site3)
    //二维列表
    val site4 = List.tabulate(2,3)(_*_)
    println(site4)



  }

}
