package ui

interface View {
    fun click()
    fun whoAmi () = println("VIEW")
}

class Button : View {
    override fun click() {
     println("Button click")
    }

}

fun main ()
{
    val  button = Button ()
    button.click()
    button.whoAmi()
}