def f(g: Int => Int) = g(5)

println(f(2 - _))
println(f(2 * _))
