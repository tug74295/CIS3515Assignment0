fun main() {
    val square : Shape = Square("Square")
    val circle : Shape = Circle("Circle")
    val triangle : Shape = Triangle("Triangle")
    val equilateralTriangle : Shape = EquilateralTriangle("Equilateral Triangle")

    print("Enter square length: ")
    val squareLength = readln().toInt()
    print("Enter square height: ")
    val squareHeight = readln().toInt()
    (square as Square).setDimensions(squareLength, squareHeight)

    print("Enter circle radius: ")
    val circleRadius = readln().toInt()
    (circle as Circle).setDimensions(circleRadius)

    print("Enter triangle side1: ")
    val triangleSide1 = readln().toInt()
    print("Enter triangle side2: ")
    val triangleSide2 = readln().toInt()
    print("Enter triangle side3: ")
    val triangleSide3 = readln().toInt()
    (triangle as Triangle).setDimensions(triangleSide1, triangleSide2, triangleSide3)

    print("Enter equilateral side: ")
    val equilateralSide = readln().toInt()
    (equilateralTriangle as EquilateralTriangle).setDimensions(equilateralSide)

    val shapes = listOf(square, circle, triangle, equilateralTriangle)
    println("")
    for (shape in shapes) {
        println("Shape name: ${shape.name}")
        shape.printDimensions()
        println("Area: ${shape.getArea()}\n")
    }
}