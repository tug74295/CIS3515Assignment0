import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    private var side1 = 0
    private var side2 = 0
    private var side3 = 0

    fun setDimensions(side1: Int, side2: Int, side3: Int) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun printDimensions() {
        println("$name dimensions:\n Side1: $side1\n Side2: $side2\n Side3: $side3")
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2.0
        return sqrt(s * (s-side1) * (s-side2) * (s-side3))
    }
}