package k.bs.designpatternsp.structural.flyweight.kt

class GlyphFactory(private val glyphCodes: MutableMap<String, GlyphCode> = mutableMapOf()) {
    fun retrieveGlyph(code: String): Glyph {
        // create Glyph Code if it does not exists
        if (code !in glyphCodes) glyphCodes[code] = GlyphCode(code)
        // create and return a new Glyph with the shared cached Glyph Code which corresponds to the requested code
        return GlyphFlyweight(glyphCodes[code] ?: GlyphCode(code))
    }
}