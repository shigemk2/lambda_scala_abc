def Y[A,B]( f:((A => B), A ) => B, x:A ):B = f( ( y:A ) => Y( f,y ),x )

val y = Y( (f:Int => Int , n:Int) => n match {
  case m if m < 2 => m
  case _ => f( n - 1 ) + f( n - 2 )
}, 10)

println(y)
