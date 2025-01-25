class Square(_name: String) : Shape (_name){
    private var length = 0
    private var height = 0
    fun setDimensions(length: Int, height: Int){
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("$name dimensions:\n Length: $length\n Height: $height")
    }

    override fun getArea(): Double {
        return (length * height).toDouble()
    }
}