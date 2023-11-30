package command_design_pattern

class FanSwitchCommand(
    private val fan: Fan
) : ICommand {
    override fun execute() {
       fan.turnOn()
    }

}