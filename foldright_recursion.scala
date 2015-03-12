def test(x: List[Int]): Int = {
  x match {
    case m if m.isEmpty => 0
    case x: List[Int] => x.head - test(x.tail)
  }
}

println(test(List(1, 2, 3, 4, 5)))
