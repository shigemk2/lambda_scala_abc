def qsort(xs: List[Int]): List[Int] = {
  if (xs.length <= 1) xs
  else {
    val pivot = xs.head
    qsort(xs.filter(pivot >)) ++
    xs.filter(pivot ==) ++
    qsort(xs.filter(pivot <))
  }
}

println(qsort(List(4, 6, 9, 8, 3, 5, 1, 7, 2)))
