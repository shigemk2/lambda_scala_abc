def bsort(list: List[Int]): List[Int] = {
  def bswap(xs: List[Int]): List[Int] = {
    xs.foldRight(List[Int]())((z, n) => {
      n match {
        case n if n.isEmpty => List(z)
        case n => {
          if (z > n.head) n.head :: z :: n.tail
          else z :: n.head :: n.tail
        }
      }
    })
  }
  val ys = bswap(list)
  ys match {
    case list if ys.isEmpty => List()
    case list => ys.head :: bsort(ys.tail)
  }
}

println(bsort(List(4,3,1,5,2)))
println(bsort(List(4,6,9,8,3,5,1,7,2)))
