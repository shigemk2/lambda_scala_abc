def add1(x: Int, y: Int) = x + y
def add2(x: Int): (Int) => Int = (y: Int) => x + y
def add3 = (x:Int) => (y: Int) => x + y
println(add1(2,3))
println(add2(2)(3))
println(add3(2)(3))
