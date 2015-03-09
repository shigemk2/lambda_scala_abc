def add(x: Int, y: Int) = x + y
val add2 = add(2, _:Int)
println(add2(3))
println((add(2, _:Int))(3))
println(add(2,3))
