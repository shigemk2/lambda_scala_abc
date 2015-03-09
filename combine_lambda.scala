val combine = (a: Any) => (b: Any) => (c: Any) => a +: b +: List(c)

val a = combine(1)
val b = a(2)
val c = b(3)
println(c)
println(combine('a')('b')('c'))
