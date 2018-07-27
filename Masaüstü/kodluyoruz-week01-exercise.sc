def min(x: List[Int]): Int = {

  if(x.head < x.tail.head )
    return x.head
  else
    min(x.tail)
}

def maxl(xl: List[Int]): Int = {
  if ( (xl.head > xl.tail.head) )
    return xl.head
  else
    maxl(xl.tail)
}

val list = List(115,23,1,52,28,45,52)
val minimum = min(list)
println("min : " + minimum)
val maximum = maxl(list)
println("max : " + maximum)
val fark = maximum - minimum
println("fark : " + fark)
