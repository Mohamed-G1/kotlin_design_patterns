package command_design_pattern.redo_undo_example

fun main() {
    val invoker = Invoker(RedoableCommand(Reciver(), "Action1"))
    val invoker2 = Invoker(RedoableCommand(Reciver(), "Action2" ))

    println(invoker.execute())
    println(invoker.undo())
}