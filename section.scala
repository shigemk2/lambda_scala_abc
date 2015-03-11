def f(g: (Int) => Int) = g(5)
def subtract(x: Int, y: Int) = y - x

println(List(f((x: Int) => x + 2), f(2+_)))
println(List(f((x: Int) => x + 2), f(_+2)))
println(List(f((x: Int) => 2 - x), f(2-_)))
println(List(f((x: Int) => x - 2), f(_+(-2)), f(subtract(2,_))))
