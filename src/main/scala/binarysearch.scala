import scala.annotation.tailrec

object binarysearch extends App {
  println("Scala program for binary search v.0.1b")

  val conList = (0 to 100).toList

  @tailrec
  def Binary_search(
      conList: List[Int],
      low: Int,
      high: Int,
      find: Int,
      it_num: Int
  ): (Int, Int) = {
    if (find > low) {
      if (find < high) {
        val med = (low + high) / 2
        val maybe = conList(med)
        if (maybe == find) (med, it_num)
        else if (maybe > find)
          Binary_search(conList, low, med + 1, find, it_num + 1)
        else Binary_search(conList, med - 1, high, find, it_num + 1)
      } else (-1, it_num) //If digit is highter than high
    } else (-1, it_num) //If digit is lower than low
  }

  val (index, iterations) = Binary_search(conList, 0, conList.length - 1, 32, 0)
  println(s"Finded digit: $index by total iterations: $iterations")
}
