def f1(x: Int, y: Int): Int = x - y
def f2(x: Int): Int = f1(3, x)
def f3 = f1(3, _:Int)
def f4 = f1(_:Int, _:Int)

println(f1(3, 2))
println(f2(2))
println(f3(2))
println(f4(3, 2))

def g1(x: Int): Int = f4(2, x)
def g2 = f4(2, _:Int)

println(g1(5))
println(g2(5))
