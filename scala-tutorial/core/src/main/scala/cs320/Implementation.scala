package cs320

/**
* Restrictions
* You must not use any of the following features in your implementation:
*  - asInstanceOf
*  - isInstanceOf
*  - null
*  - return
*  - throw
*  - var
*  - while
*  - try-catch
*  - mutable data structures
* You can use any other features that are not explicitly forbidden. For example,
*  - You can define helper functions and additional types.
*  - You can use immutable data structures.
*  - You can use for.
*  - You can mutate mutable variables/fields already defined in the provided code.
* The use of the prohibited features will make your code not compile.
* If your code compiles successfully, you are not using any prohibited features.
*/

object Implementation extends Template {

  def volumeOfCuboid(a: Int, b: Int, c: Int): Int = a * b *c

  def concat(x: String, y: String): String = x + y

  def addN(n: Int): Int => Int = _ + n

  def twice(f: Int => Int): Int => Int = n => f(f(n))

  def compose(f: Int => Int, g: Int => Int): Int => Int = n => g(f(n))

  def double(l: List[Int]): List[Int] = l.map(_ * 2)

  def sum(l: List[Int]): Int = l.fold(0)(_ + _)

  def getKey(m: Map[String, Int], s: String): Int = m.getOrElse(s, error(s))

  def countLeaves(t: Tree): Int = t match {
    case Leaf(_) => 1
    case Branch(l, _, r) => countLeaves(l) + countLeaves(r)
  }

  def flatten(t: Tree): List[Int] = t match {
    case Leaf(v) => List(v)
    case Branch(l, v, r) => List.concat(flatten(l), v :: flatten(r))
  }
}
