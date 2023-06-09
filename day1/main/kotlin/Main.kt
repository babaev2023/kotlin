
val firstName : String= "Masha"
var LastName = "Ivanova"
var age = 25

const val DEBUG = true

fun main(args: Array<String>) {

    //fi
    println("Hello World!")
    age = 26
    // age = "twenty" - так нельзя

    //if
    /*
    val temperature = 26
    val condition = if(temperature< -5 )
        "Холодно"
    else if (temperature<5)
        "Около нуля"
    else
        "Жарко"
    */

    val temperature = 26

    val condition = when {
        temperature< -5 -> "Холодно"
        temperature<5   -> "Около нуля"
        else            -> "Жарко"
    }

    // Переменные нулевого типа
    var position : String? = "prog"
    position = null
    if (position !=null)
    println("length is " + position.length)
    //тоже самое
    println("length is " + position?.length)
    println(position?.length ?: 0)

    //println("length is " + position!!.length) //принудительно

    val obj : Any = "15"

    if (obj is String)
    {
        println("len is " + obj.length)
    }

    val x: String = obj as String /// Небезопасносное приведение

    val k: String? = age as? String // Безопасное приведение
    println(k)

    //JAVA
    println("Имя: " + firstName + " Фамилия: " +LastName+ " возраст: " + age )
    //Kotlin
    println("Имя: $firstName Фамилия: $LastName возраст: ${age+1}   \$")

    println("""
        1 line
        2 line
        3 line
    """.trimIndent());

    println("""
        |SELECT * FROM USERS
        |WHERE age > 24
        |GROUP BY NAME
        """.trimMargin());

    println(greeting(last = "Ivanova", first = "Masha"))
    println(greeting(first ="Masha"))

    //while / do-while

    var counter = 0;
    while (counter < 10)
    {
        println("${counter++}")
    }

    println("Введите команду: ****")
    do {
        val command = readLine();
        println("Для выхода из цикла введите quit, вы ввели: $command")

    } while (command !="quit")

    
}

//Функция
//fun greeting(first:String,last: String ="Petrova") = "Hello, $first $last"

fun greeting(first:String,last: String ="Petrova") : String
{
    require(!first.isBlank()) {"Нужно указать Имя"}
    require(!last.isBlank()) {"Нужно указать Фамилию"}
    return "Hello, $first $last"
}
