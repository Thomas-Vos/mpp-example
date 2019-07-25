package org.greeting

expect class Platform() {
    val platform: String
}

class Greeting {
    fun greeting(): String = "Hello, ${Platform().platform}"
}

class Example {
    fun main() {
        callLambda(::example)
    }

    private fun example(a: String, b: String = "") {

    }

    private fun callLambda(block: (String) -> Unit) {
        block("")
    }
}
