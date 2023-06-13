package graphics

class Rectangle
(val height: Int, val widht: Int) {
    val isSquare: Boolean
        get() = height == widht

    val area : Int
        get() = height*widht
    var death: Int = 0
        set(value) {
            println("Old value $field new value $value")
            field = value
        }

}

fun main ()
{
    val r = Rectangle(12,20)
    r.death = 12
}