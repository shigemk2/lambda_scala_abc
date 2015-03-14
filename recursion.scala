def mmap(g: Int => Int, xs: Seq[Int]): Seq[Int] = {
  xs match {
    case m if m.isEmpty => Seq()
    case xs: Seq[Int] => g(xs.head) +: mmap(g, xs.tail)
  }
}

def mfilter(g: Int => Boolean, xs: Seq[Int]): Seq[Int] = {
  xs match {
    case xs if xs.isEmpty => Seq()
    case xs if g(xs.head) == true  => xs.head +: mfilter(g, xs.tail)
    case xs if g(xs.head) == false => mfilter(g, xs.tail)
  }
}

def mflip[A, B, C](f: (A, B) => C)(x: B)(y: A) = f(y, x)

println(mmap((_*2), (1 to 5)))
println(mfilter((x => x < 5), (1 to 9)))
println(mflip(mmap)(1 to 5)(_*2))
