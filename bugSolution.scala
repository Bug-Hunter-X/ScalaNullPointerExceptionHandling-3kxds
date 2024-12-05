```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    if (y == null) 0 // Handle null input gracefully
    else x + y
  }
}

object Main extends App {
  val obj = new MyClass(10)
  println(obj.myMethod(5)) //This line will print 15
  println(obj.myMethod(null)) //This will print 0
}
```