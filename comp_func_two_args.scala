def f(x: Int): Int = x * 2
def g(x: Int, y: Int): Int = x + y

println(f(g(1, 2)))
// println((g _).compose(f)(1)(2))
