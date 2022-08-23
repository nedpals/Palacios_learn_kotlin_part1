fun main() {
  // Write your code below 📝
  var testGrades = mutableSetOf(65, 50, 72, 80, 53, 84)
  val sum = testGrades.sum()
  val numStudents = testGrades.size
  val average = sum / numStudents
  if (average < 65) {
    println("Failed")
  } else {
    println("Passed")
  }
}