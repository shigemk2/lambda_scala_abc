// val add: (Int, Int) => Int = (x, y) => x + y
val add = ((x: Int, y: Int) => x + y): (Int, Int) => Int

println(add(2, 3))
println(add(9, 3))
