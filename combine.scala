def combine(a: Any, b: Any, c: Any) = {
  a +: b +: List(c)
}

val a = combine(1, _:Any, _:Any)
val b = a(2, _:Any)
val c = b(3)
println(c)
println(combine('a','b','c'))
