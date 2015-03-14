def mmap(g: Int => Int, xs: Seq[Int]): Seq[Int] = {
  xs match {
    case m if m.isEmpty => Seq()
    case xs: Seq[Int] => g(xs.head) +: mmap(g, xs.tail)
  }
}

println(mmap((x => x * 2), (1 to 5)))

