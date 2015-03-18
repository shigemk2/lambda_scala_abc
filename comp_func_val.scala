val add10 = (n:Int) => n + 10
val mult2 = (n:Int) => n * 2
val addxy = (x:Int,y:Int) => x + y
println(add10.andThen(mult2)(1))
println(add10.compose(mult2)(1))
// println(addxy.andThen(mult2)(1)(2))
// println(mult2.compose(addxy)(1)(2))

