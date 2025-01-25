class Circle(_name: String) : Shape (_name){
    private var radius = 0
    fun setDimensions(radius: Int) {
        this.radius = radius
    }

    override fun printDimensions() {
        println("$name dimensions:\n Radius: $radius")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}