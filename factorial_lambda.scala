val fact: Int => Int = n => n match {
  case 0 => 1
  case n if n > 0 => n * fact(n - 1)
  case _ => 1
}

// factの時点で型を決めておかないといけないからこの書き方はダメ
// val fact = (n => n match {
//   case 0 => 1
//   case n if n > 0 => n * fact(n - 1)
// }): Int => Int
println(fact(5))
println(fact(0))
println(fact(-1))
