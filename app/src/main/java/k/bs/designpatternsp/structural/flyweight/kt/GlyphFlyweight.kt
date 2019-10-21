package k.bs.designpatternsp.structural.flyweight.kt

class GlyphFlyweight(private val code: GlyphCode, override var position: Int = 0) : Glyph {
    override fun show(): String = code.code
}