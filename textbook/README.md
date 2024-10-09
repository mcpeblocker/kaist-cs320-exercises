# [CS320 - Programming Languages course](https://plrg.kaist.ac.kr/lectures/cs320-fall-2024) textbook exercises

**Written by [Alisher Ortiqov](https://github.com/mcpeblocker) in 2024 Fall semester at [KAIST](https://www.kaist.ac.kr/en/).**

## sbt project compiled with Scala 3

### Requirements

- Scala development environment setup according to the [textbook](#textbook)

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.
Additionally, `sbt test` can test the code against pre-written test cases

- There is one test case for each exercise implementation

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).

### Textbook

The course textbook is available at:
[Jaeming Hong's website](https://hjaem.info/itpl)

### Exercises

- Chapter 3:
  - [Implementation](./src/main/scala/Chapter3.scala)
  - [Test cases](./src/test/scala/Chapter3.scala)
- Chapter 4:
  - [Implementation](./src/main/scala/Chapter4.scala)
  - [Test cases](./src/test/scala/Chapter4.scala)
