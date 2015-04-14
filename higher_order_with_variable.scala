def f(g: (Int, Int) => Int) = g(2, 3)

def add(x: Int, y: Int): Int = x + y
val mul = ((x: Int, y: Int) => x * y): (Int, Int) => Int

// メソッドでも変数でもどちらでも渡せる
println(f(add))
println(f(mul))
