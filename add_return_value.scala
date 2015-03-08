def add(x: Int): (Int) => Int = {
  (y: Int) => x + y
}
println(add(1)(2))
