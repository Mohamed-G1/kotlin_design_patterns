package command_design_pattern

fun main() {
    val remoteControlInvoker = RemoteControlInvoker(FanSwitchCommand(Fan()))
    println(remoteControlInvoker.execute())


    val remoteControlInvoker2 = RemoteControlInvoker(LightSwitchCommand(Light()))
    println(remoteControlInvoker2.execute())
}