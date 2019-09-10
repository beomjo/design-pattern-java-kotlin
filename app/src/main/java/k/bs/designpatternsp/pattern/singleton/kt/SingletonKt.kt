package k.bs.designpatternsp.pattern.singleton.kt

class SingletonKt {

    companion object {

        private var instance: SingletonKt? = null

        @JvmStatic
        fun getInstance(): SingletonKt =
            instance ?: synchronized(this) {
                instance ?: SingletonKt().also { instance = it }
            }
    }
}