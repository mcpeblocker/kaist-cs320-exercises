// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class Chapter4 extends munit.FunSuite {
  // Mock data
  val integers: List[Int] = List(0,5,10,15,20,25,30,35,40,45,50)
  val n = 10
  // Test cases
  test("Exercise 4.1:") {
    val obtained = incBy(integers, n)
    val expected = integers.map(_ + n)
    assertEquals(obtained, expected)
  }
  test("Exercise 4.2:") {
    val obtained = gt(integers, n)
    val expected = integers.filter(_ <= n)
    assertEquals(obtained, expected)
  }
  test("Exercise 4.3:") {
    val obtained = append(integers, n)
    val expected = integers.appended(n)
    assertEquals(obtained, expected)
  }
  test("Exercise 4.4:") {
    val obtained = reverse(integers)
    val expected = integers.reverse
    assertEquals(obtained, expected)
  }
}
