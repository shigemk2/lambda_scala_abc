// println(((x: Int, y: Int) => x + y)(2, 3))
println((((x: Int, y: Int) => x + y): ((Int, Int) => Int))(2, 3))
