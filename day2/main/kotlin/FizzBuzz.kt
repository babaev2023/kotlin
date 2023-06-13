/*
Функция, которая возвращает строку в зависимости от значения int
делится на 3 и 5 - > FizzBuzz
делится на 3 - > Fizz
делится на 5 - > Buzz
делится на 4 - >
*/


fun fizzbuzz (date: Int) : String {
    when
    {
        date % 3 == 0 && date % 5 == 0 -> return "$date: FizzBuzz"
        date % 3 == 0                  -> return "$date: Fizz"
        date % 5 == 0                  -> return "$date: Buzz"
        else                           -> return "$date:"
    }
}

fun main()
{
    for (i in 1..100)
    {
        println(fizzbuzz(i))
    }
}