def f(g: (Int, Int) => Int) = g(2, 3)

println(f(_+_))
println(f(_*_))
