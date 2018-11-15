object TestSet {
  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3)
    println(set.getClass.getName)

    println(set.exists(_ % 2 == 0))
    println(set.drop(1))

    import scala.collection.mutable.Set
    val mutableSet = Set(1, 2, 3)
    println(mutableSet.getClass.getName)
    mutableSet.add(4)
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet -= 2

    println(mutableSet)

    mutableSet.add(6)
    val another = mutableSet.toSet
    println(another.getClass.getName)

    println(set.head)

    println(set.tail)

    println(set.tails.getClass.getName)

    println(set.isEmpty)

    val three = set++another
    println(set)
    println(another)
    println(three)
    println(three.min)
    println(three.max)
    //交集
    println(set.&(another))
    println(set+(5))
    /*
    scala.collection.immutable.Set$Set3
true
Set(2, 3)
scala.collection.mutable.HashSet
Set(5, 3, 4)
scala.collection.immutable.Set$Set4
      */
  }
}
