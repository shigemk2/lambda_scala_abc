def f1(g: Int => Int) = g(1)
def f2(g: (Int, Int) => Int) = g(2, 3)

// 新しい関数を定義してはいけない
// def sub1(x:Int) = x - 3
// def sub2(x:Int) = 3 - x
// def add(x:Int, y: Int) = x + y

println(f1(3-_))
println(f1(_-(3)))
println(f2(_+_))
