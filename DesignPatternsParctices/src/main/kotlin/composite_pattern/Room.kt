package composite_pattern

class Room(
    private val name: String
) : IStructure {
    override fun enter() {
        println("You entered $name room")
    }

    override fun exist() {
        println("You exist from $name room")
    }

    override fun location() {
        println("You at $name house room")
    }

    override fun getName() {
        println("The name of the room is $name")
    }
}