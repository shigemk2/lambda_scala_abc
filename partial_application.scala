// これと
// def add(x: Int)(y: Int): Int = x + y
// これは、呼び出し方が微妙に違う
def add = (x:Int) => (y: Int) => x + y
val add2 = add(2)
println(add2(3))
println((add(2))(3))
println(add(2)(3))
