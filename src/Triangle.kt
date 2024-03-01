class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {

    fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    fun calculateArea(): Double {
        val semiPerimeter = calculatePerimeter() / 2
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
    }
}

fun main() {
    // Example usage
    val triangle = Triangle(3.0, 4.0, 5.0)

    val perimeter = triangle.calculatePerimeter()
    val area = triangle.calculateArea()

    println("Triangle Perimeter: $perimeter")
    println("Triangle Area: $area")
}
