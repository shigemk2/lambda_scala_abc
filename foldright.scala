println((1 to 5).foldRight(0)((z, n) => z - n))
println((1 to 5).foldLeft(0)((z, n) => z - n))

