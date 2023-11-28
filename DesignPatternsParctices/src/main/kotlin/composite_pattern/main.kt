package composite_pattern

fun main() {
    val house = Housing(name = "house number 7")

    // add rooms into house
    house.apply {
        addRooms(room = Room(name = "Room 1"))
        addRooms(room = Room(name = "Room 2"))
        addRooms(room = Room(name = "Room 3"))
    }



    println(house.location())
    println(house.getAllRooms())

}