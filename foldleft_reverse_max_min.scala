def mreverse(xs: Seq[Int]): Seq[Int] = {
  xs.foldLeft(Seq[Int]())((z, n) => n +: z)
}

def maximum(xs: Seq[Int]): Int = {
  xs.foldLeft(xs.head)((z, n) => if (z < n) n else z)
}

def minimum(xs: Seq[Int]): Int = {
  xs.foldLeft(xs.head)((z, n) => if (z > n) n else z)
}

println(mreverse((-5 to 5)))
println(maximum((-5 to 5)))
println(minimum((-5 to 5)))
