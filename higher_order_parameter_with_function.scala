def f(g: (Int, Int) => Int) = g(1, 2)
def add(x: Int, y: Int): Int = x + y

println(f(add))
