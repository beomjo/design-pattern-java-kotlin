package k.bs.designpatternsp.pattern.builder.kt

class MyDialog private constructor(
    private val title: String,
    private val text: String?,
    private val onAccept: (() -> Unit)?
) {
    class Builder(val title: String) {
        private var text: String? = null
        private var onAccept: (() -> Unit)? = null

        fun setText(text: String?): Builder {
            this.text = text
            return this
        }

        fun setOnAccept(onAccept: (() -> Unit)?): Builder {
            this.onAccept = onAccept
            return this
        }

        fun build() = MyDialog(title, text, onAccept)
    }
}