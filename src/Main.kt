class feature_square(val sideLength: Double) {
    fun calculateArea(): Double {
        return sideLength * sideLength
    }
    fun calculatePerimeter(): Double {
        return 4 * sideLength
    }
}