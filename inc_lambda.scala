val inc = (x: Int) => x + 1
// val inc = (x: Int) => {
//   x match {
//     case 0 => 1
//     case x => x * inc(x-1)
//   }
// }
val inc = (x => x + 1): Int => Int
val inc: Int => Int = x => x + 1

println(inc(5))
