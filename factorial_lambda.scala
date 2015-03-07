val fact : Int => Int = n => {
  n match {
    case 0 => 1
    case n if n > 0 => n * fact(n - 1)
  }
}

println(fact(5))
println(fact(0))
