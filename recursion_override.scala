implicit def convert(xs:Seq[Int]): {def mmap(g: Int => Int): Seq[Int]} = new{
  def mmap(g: Int => Int): Seq[Int] = {
    xs match {
      case m if m.isEmpty => Seq()
      case xs: Seq[Int] => g(xs.head) +: xs.tail.mmap(g)
    }
  }
}

println((1 to 5).mmap((_*2)))
