package command_design_pattern.redo_undo_example

interface ICommand {
    fun execute()
    fun undo()
}