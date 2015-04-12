// This can be achieved by adding the import clause 'import scala.language.reflectiveCalls' or by setting the compiler option -language:reflectiveCalls.
import scala.language.implicitConversions
import scala.language.reflectiveCalls

implicit def convert1(xs:Seq[Int]): {
  def mmap(g: Int => Int): Seq[Int]
  def mfilter(g: Int => Boolean): Seq[Int]
  def mfoldLeft(z: Int, g: (Int, Int) => Int): Int
  def mfoldRight(z: Int, g: (Int, Int) => Int): Int
} = new {
  def mmap(g: Int => Int): Seq[Int] = {
    xs match {
      case m if m.isEmpty => Seq()
      case xs: Seq[Int] => g(xs.head) +: xs.tail.mmap(g)
    }
  }

  def mfilter(g: Int => Boolean): Seq[Int] = {
    xs match {
      case xs if xs.isEmpty => Seq()
      case xs if g(xs.head) == true  => xs.head +: (xs.tail).mfilter(g)
      case xs if g(xs.head) == false => (xs.tail).mfilter(g)
    }
  }

  def mfoldLeft(z: Int, g: (Int, Int) => Int): Int = {
    (z, g, xs) match {
      case (z, g, xs) if xs.isEmpty => z
      case (z, g, xs) => (xs.tail).mfoldLeft(g(z, xs.head), g)
    }
  }

  def mfoldRight(z: Int, g: (Int, Int) => Int): Int = {
    (z, g, xs) match {
      case (z, g, xs) if xs.isEmpty => z
      case (z, g, xs) => g(xs.head, (xs.tail).mfoldRight(z, g))
    }
  }
}

println((1 to 5).mmap((_*2)))
println((1 to 9).mfilter((x => x < 5)))
println((1 to 100).mfoldLeft(0, (_+_)))
println((1 to 5).mfoldLeft(0, (_-_)))
println((1 to 5).mfoldRight(0, (_-_)))
