def f(g: (Int, Int) => Int) = g(2, 3)

println(f((x: Int, y: Int) => x + y))
println(f((x: Int, y: Int) => x * y))
