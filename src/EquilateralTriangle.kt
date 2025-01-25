class EquilateralTriangle(_name: String) : Triangle(_name) {
    fun setDimensions(side: Int) {
        super.setDimensions(side, side, side)
    }
}