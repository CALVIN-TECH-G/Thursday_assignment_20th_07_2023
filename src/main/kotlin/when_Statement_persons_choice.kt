fun main(){
    println("Enter preferred choice: Pizza or Chicken Or Pancake or Cake")
    var choice = readln()

    when(choice){
        "Chicken" -> print("Kfc")
        "Pizza" -> print("Pizza Hut")
        "Cake" -> print("Cakely")
        "PanCake" -> print("Food Hub")
        else -> print("Option not currently supported")
    }
}