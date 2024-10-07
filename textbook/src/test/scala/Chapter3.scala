// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class Chapter3 extends munit.FunSuite {
  // Mock data
  val student1 = Student("Hobbit", 90)
  val student2 = Student("Merlin", 170)
  val student3 = Student("Sherlock Holmes", 175)
  val student4 = Student("John Doe", 180)
  val students: List[Student] = List(student1, student2, student3, student4)
  val integers: List[Int] = List(1, 2, 3, 4, 5)
  // Test cases
  test("Exercise 3.1:") {
    val obtained = names(students)
    val expected = List("Hobbit", "Merlin", "Sherlock Holmes", "John Doe")
    assertEquals(obtained, expected)
  }
  test("Exercise 3.2:") {
    val obtained = tall(students)
    val expected = List(student3, student4)
    assertEquals(obtained, expected)
  }
  test("Exercise 3.3:") {
    val obtained = length(integers)
    val expected = 5
    assertEquals(obtained, expected)
  }
  test("Exercise 3.4:") {
    val obtained = append(integers, 10)
    val expected = integers ++ List(10)
    assertEquals(obtained, expected)
  }
}
