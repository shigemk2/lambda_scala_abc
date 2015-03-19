val add: Int => Int => Int = x => y => x + y
println(add(1)(2))
def add1(x: Int): Int = add(1)(x)
println(add1(1))
def add2 = add(1)
println(add2(4))


