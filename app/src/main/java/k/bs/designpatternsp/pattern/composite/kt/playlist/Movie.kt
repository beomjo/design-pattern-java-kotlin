package k.bs.designpatternsp.pattern.composite.kt.playlist

class Movie(val title:String): IMedia {
    private var speed = 1f

    override fun play() {
        println("Now playing: ${title}...")
    }

    override fun displaySubtitle() {
        println("display subtitle")
    }

    override fun setPlaySpeed(speed:Float) {
        this.speed = speed
        println("current play speed set to: $speed")
    }

    override fun getName(): String {
        return title
    }
}
