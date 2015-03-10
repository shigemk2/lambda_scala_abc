def f(xs: List[Int], g: (Int) => Int) = for (x <- xs) yield g(x)

println(f(List(1,2,3,4,5), (2.*)))
