def flip[A, B, C](f: A => B => C)(x: B)(y: A) = f(y)(x)
def append: String => String => String = a => a + _
def sub: Int => Int => Int = a => a - _

val flipped = flip(append)(_)
println(flipped("foo")("bar"))
println(flip(append)("foo")("bar"))

println(flip(sub)(5)(3))
println(flip(sub)(3)(5))

