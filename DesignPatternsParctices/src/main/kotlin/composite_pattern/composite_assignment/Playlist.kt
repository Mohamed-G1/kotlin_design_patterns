package composite_pattern.composite_assignment

class Playlist(
     val playListName: String
) : IComponent {

    var playList: ArrayList<IComponent> = arrayListOf()

    override fun play() {
       playList.forEach {
           println("Playlist played ${it.play()}")
       }
    }

    override fun setPlaybackSpeed(speed: Float) {
       playList.forEach {
           println("Playlist speed ${it.setPlaybackSpeed(speed = speed)}")
       }
    }

    override fun getName(): String {
        return playListName
    }

    fun add(iComponent: IComponent) {

        playList.add(iComponent)
    }

    fun remove(iComponent: IComponent) {
        playList.remove(iComponent)

    }
}