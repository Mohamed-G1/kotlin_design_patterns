package composite_pattern

class Housing(
    private val name: String
) : IStructure {
    private val addRooms = mutableListOf<IStructure>()
    override fun enter() {
        println("You entered $name house")
    }

    override fun exist() {
        println("You exist from $name house")
    }

    override fun location() {
        println("You at $name house location")
    }

    override fun getName() {
        println(
            "The house's name is $name"
        )
    }

    fun addRooms(room: IStructure) {
        addRooms.add(room)
    }

    fun getAllRooms() {
        addRooms.forEach { rooms ->
            val name = rooms.getName().toString()
            println(name)
        }

    }
}