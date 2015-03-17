def f(x: Int): Int = x + 1
def g(x: Int): Int = x * 2

println(f(g(1)))
println((f _).andThen(g)(1))
println((f _).compose(g)(1))
