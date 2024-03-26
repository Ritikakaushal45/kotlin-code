import java.time.DayOfWeek

// Data class to represent coffee preferences
data class Coffee(val type: String, val sugar: Int)

// Main class for the Robot
class Robot(private val name: String) {
    // Function to ring the alarm
    fun ringAlarm(alarmTime: String, offDays: List<DayOfWeek>) {
        val currentDay = DayOfWeek.from(java.time.LocalDate.now())
        if (!offDays.contains(currentDay)) {
            println("$name rings the alarm at $alarmTime")
        }
    }

    // Function to make coffee
    fun makeCoffee(preferences: Coffee) {
        println("$name makes ${preferences.type} coffee with ${preferences.sugar} sugar")
    }

    // Function to heat water
    fun heatWater(temperature: Int, willBathe: Boolean = true) {
        if (willBathe) {
            println("$name heats water to $temperature degrees for bathing")
        } else {
            println("$name heats water to $temperature degrees")
        }
    }

    // Function to pack bag
    fun packBag(books: List<String>) {
        println("$name packs bag with books: $books")
    }

    // Function to cook breakfast and lunch
    fun cookMeals(breakfastOptions: List<String>, lunchOptions: List<String>) {
        val breakfast = breakfastOptions.random()
        val lunch = lunchOptions.random()
        println("$name cooks $breakfast for breakfast and $lunch for lunch")
    }

    // Function to iron clothes
    fun ironClothes(clothes: String) {
        println("$name irons $clothes")
    }
}

fun main() {
    // Create a Robot instance
    val myRobot = Robot("KotlinBot")

    // Set up preferences
    val coffeePreferences = Coffee("Black", 2)
    val bagBooks = listOf("Maths", "Science", "History")
    val breakfastOptions = listOf("Omelette", "Cereal", "Pancakes")
    val lunchOptions = listOf("Sandwich", "Salad", "Pasta")

    // Call functions to perform tasks
    myRobot.ringAlarm("7:00 AM", listOf(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY))
    myRobot.makeCoffee(coffeePreferences)
    myRobot.heatWater(40)
    myRobot.packBag(bagBooks)
    myRobot.cookMeals(breakfastOptions, lunchOptions)
    myRobot.ironClothes("Shirt and Trousers")
}
