import java.sql.Array
import java.util.*
import kotlin.math.pow

fun main() {
dayOfWeek()
}

fun dayOfWeek(){


    println("What day is it")

    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){


        1-> println("Today is Sunday")
        2-> println("Today is Monday")
        3-> println("Today is Tuesday")
        4-> println("Today is Wednesday")
        5-> println("Today is Thursday")
        6-> println("Today is Friday")
        7-> println("Today is Saturday")

    }
}