// 型注釈とラムダ式を並べると、型注釈の書式がラムダ式と共通していることが分かります
// が、ScalaはHaskellと違ってラムダ式と型注釈が一緒になっています
val fact : Int => Int =
             n => {
               n match {
                 case 0 => 1
                 case n if n > 0 => n * fact(n - 1)
               }
             }

println(fact(5))
println(fact(0))
