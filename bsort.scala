def bsort(list: List[Int]): List[Int] = {
  def bswap(xs: List[Int]): List[Int] = {
    xs match {
      case xs if xs.length == 1 => List(xs.head)
      case xs => {
        lazy val ys = bswap(xs.tail)
        if (xs.head > ys.head) ys.head :: xs.head :: ys.tail
        else xs.head :: ys.head :: ys.tail
      }
    }
  }

  lazy val ys = bswap(list)
  list match {
    case list if list.isEmpty => List()
    case list => ys.head :: bsort(ys.tail)
  }
}

println(bsort(List(4,3,1,5,2)))
