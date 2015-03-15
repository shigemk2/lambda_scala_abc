implicit def convert1(xs:Seq[Int]): {def mmap(g: Int => Int): Seq[Int]} = new{
  def mmap(g: Int => Int): Seq[Int] = {
    xs match {
      case m if m.isEmpty => Seq()
      case xs: Seq[Int] => g(xs.head) +: xs.tail.mmap(g)
    }
  }
}

implicit def convert2(xs:Seq[Int]): {def mfilter(g: Int => Boolean): Seq[Int]} = new{
  def mfilter(g: Int => Boolean): Seq[Int] = {
    xs match {
      case xs if xs.isEmpty => Seq()
      case xs if g(xs.head) == true  => xs.head +: (xs.tail).mfilter(g)
      case xs if g(xs.head) == false => (xs.tail).mfilter(g)
    }
  }
}

println((1 to 5).mmap((_*2)))
println((1 to 9).mfilter((x => x < 5)))
