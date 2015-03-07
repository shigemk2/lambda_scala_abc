def mul1 (x: Int, y: Int) = x * y
val mul2 = (x: Int, y: Int) => x * y
val mul3 = (x: Int) => (y: Int) => x * y

println(mul1(2, 3))
println(mul2(2, 3))
println(mul3(2)(3))
