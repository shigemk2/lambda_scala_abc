def f(g: (Int, Int) => Int) = g(2, 3)

def add(x: Int, y: Int) = x + y
val mul = (x: Int, y: Int) => x * y

println(f(add))
println(f(mul))
