def f(g: (Int, Int) => Int) = g(2, 3)

println(f((x: Int, y: Int) => x + y))
println(f((x: Int, y: Int) => x * y))
// 型推論されるので型は指定しなくても良い
println(f((x, y) => x + y))
println(f((x, y) => x * y))
// 引数と戻り値両方の型を指定する場合
println(f(((x, y) => x + y): (Int, Int) => Int))
println(f(((x, y) => x * y): (Int, Int) => Int))
