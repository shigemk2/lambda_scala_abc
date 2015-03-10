def f(xs: List[Int], g: (Int) => Int) = for (x <- xs) yield g(x)
def double (x: Int) = 2 * x

println(f(List(1,2,3,4,5), double))
