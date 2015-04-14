def mul1 (x: Int, y: Int): Int = x * y
val mul2 = ((x: Int, y: Int) => x * y): (Int, Int) => Int

println(mul1(2, 3))
println(mul2(2, 3))

