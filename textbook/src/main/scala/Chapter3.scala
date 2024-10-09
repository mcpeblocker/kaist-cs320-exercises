import scala.annotation.tailrec

/**
  * 3.4 Exercises
  */
case class Student(name: String, height: Int)

/**
  * Exercise 3.1
  * Implement function names that takes
  * a list of students as an argument and
  * returns a list containing the names of the students.
  */
def names(l: List[Student]): List[String] = {
    @tailrec def aux(l: List[Student], r: List[String]): List[String] = l match {
        case Nil => r
        case hd :: tl => aux(tl, r ++ List(hd.name))
    }
    aux(l, List())
}

/**
  * Exercise 3.2
  * Consider the same definition of Student.
  * Implement a function tall that takes
  * a list of students as an argument and
  * returns a list of students whose heights are greater than 170.
  */
def tall(l: List[Student]): List[Student] = {
    @tailrec def aux(l: List[Student], r: List[Student]): List[Student] = l match {
        case Nil => r
        case hd :: tl => if hd.height > 170 then aux(tl, r ++ List(hd)) else aux(tl, r)
    }
    aux(l, List())
}

/**
  * Exercise 3.3
  * Implement a function length that takes
  * a list of integers as an argument and returns
  * the length of the list.
  * Note that there is a built-in method l.length,
  * but try to implement by yourself with recursion.
  */
def length(l: List[Int]): Int = {
    @tailrec def aux(l: List[Int], r: Int): Int = l match {
        case Nil => r
        case hd :: tl => aux(tl, r + 1)
    }
    aux(l, 0)
}

/**
  * Exercise 3.4
  * Implement a function append that takes
  * a list of integers and an integer as arguments and returns
  * a list obtained by appending the integer at the end of the list.
  * Then, compare the time complexity of
  * appending a new element to that of
  * prepending a new element by ::, which is O(1).
  * Note that there is a built-in method l.appended(n),
  * but try to implement by yourself with recursion.
  */
def append(l: List[Int], n: Int): List[Int] = {
    def aux(l: List[Int]): List[Int] = l match {
        case Nil => List(n)
        case hd :: tl => hd :: aux(tl)
    }
    aux(l)
}

@main def runCh3(): Unit =
    println("Chapter 3 Exercises")
    val students: List[Student] = List(
        Student("Hobbit", 90),
        Student("Merlin", 170),
        Student("Sherlock Holmes", 175),
        Student("John Doe", 180),
    )
    val integers: List[Int] = List(1,2,3,4,5)
    // 3.1
    println("\n - Exercise 3.1:")
    val result_3_1 = names(students)
    println(result_3_1)
    // 3.2
    println("\n - Exercise 3.2:")
    val result_3_2 = tall(students)
    println(result_3_2)
    // 3.3
    println("\n - Exercise 3.3:")
    val result_3_3 = length(integers)
    println(result_3_3)
    // 3.4
    println("\n - Exercise 3.4:")
    val result_3_4 = append(integers, 10)
    println(result_3_4)