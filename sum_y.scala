def Y[A,B]( f:((A => B), A ) => B, x:A ):B = f( ( y:A ) => Y( f,y ),x )

val y = Y( (f:Seq[Int] => Int , n:Seq[Int]) => n match {
  case n if n.isEmpty => 0
  case _ => n.head + f(n.tail)
}, (1 to 100))

println(y)
