/**
  * 3.4 Exercises
  */

/**
  * Exercise 4.1
  * Implement a function incBy that takes
  * a list of integers and an integer as arguments and
  * increases every element of the list by the given integer.
  * Use the map method.
  */
def incBy(l: List[Int], n: Int): List[Int] =
    l.map(_ + n)

/**
  * Exercise 4.2
  * Implement a function gt that takes
  * a list of integers and an integer as arguments and
  * filters elements less than or equal to the given
  * integer out from the list.
  * Use the filter method.
  */
def gt(l: List[Int], n: Int): List[Int] =
    l.filter(_ <= n)

/**
  * Exercise 4.3
  * Implement a function append that takes
  * a list of integers and an integer as arguments and
  * returns a list obtained by appending the integer
  * at the end of the list.
  * Use the foldRight method.
  */
def append(l: List[Int], n: Int): List[Int] =
    l.foldRight(List(n))((x, acc) => x :: acc)

/**
  * Exercise 4.4
  * Implement a function reverse that takes
  * a list of integers and returns a list
  * obtained by reversing the order between the elements.
  * Use the foldLeft method.
  */
def reverse(l: List[Int]): List[Int] =
    l.foldLeft(List())((acc, x) => x :: acc)

@main def runCh4 =
    println("Chapter 4 Exercises")
    val integers: List[Int] = List(0,5,10,15,20,25,30,35,40,45,50)
    val n = 10
    // 4.1
    println("\n - Exercise 4.1:")
    val result_4_1 = incBy(integers, n)
    println(result_4_1)
    // 4.2
    println("\n - Exercise 4.2:")
    val result_4_2 = gt(integers, n)
    println(result_4_2)
    // 4.3
    println("\n - Exercise 4.3:")
    val result_4_3 = append(integers, n)
    println(result_4_3)
    // 4.4
    println("\n - Exercise 4.4:")
    val result_4_4 = reverse(integers)
    println(result_4_4)