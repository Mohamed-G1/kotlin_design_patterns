package command_design_pattern.redo_undo_example

class Reciver {

    private val history: MutableList<String> = mutableListOf()

    fun performAction(action: String) {
        history.add(action)
        println("Action Performed $action")
    }

    fun undoAction(action: String) {
        if (history.contains(action)) {
            val removedItem = history.lastIndexOf(action)
            history.removeAt(removedItem)
            println("Undoing action: $action")
        } else {
            println("Cannot undo action: $action")
        }
    }

    fun printAllHistory() {
        history.forEach {
            println(it)
        }
    }
}