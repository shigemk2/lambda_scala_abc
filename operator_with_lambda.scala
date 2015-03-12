def f1(g: (Int) => Int) = g(1)
def f2(g: (Int, Int) => Int) = g(2, 3)

println(f1((x:Int) => x - 3))
println(f1((x:Int) => 3 - x))
println(f2((x:Int, y:Int) => x + y))
