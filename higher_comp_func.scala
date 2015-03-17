def f(x: Int): Int = x + 1
def g(x: Int): Int = x * 2
def h(f: (Int) => Int) = f(1)

println(f(g(1)))
println(f(h(g)))
println(h((x: Int) => f(g(x))))
