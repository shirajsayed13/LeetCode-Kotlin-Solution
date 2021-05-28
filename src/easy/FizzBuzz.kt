package easy

import java.util.stream.Collectors
import java.util.stream.IntStream


class FizzBuzz {
    fun traditionalFizzBuzz(n: Int): List<String> {
        val list = mutableListOf<String>()
        for (i in 1..n) {
            when {
                (i % 3 == 0 && i % 5 == 0) -> list.add("FizzBuzz")
                i % 3 == 0 -> list.add("Fizz")
                i % 5 == 0 -> list.add("Buzz")
                else -> list.add("$i")
            }
        }
        return list
    }

    fun optimizedFizzBuzz(n: Int): List<String>? {
        return IntStream.range(1, n + 1)
            .boxed()
            .map { i: Int ->
                when {
                    (i % 3 == 0 && i % 5 == 0) -> "FizzBuzz"
                    i % 3 == 0 -> "Fizz"
                    i % 5 == 0 -> "Buzz"
                    else -> i.toString()
                }
            }
            .collect(Collectors.toList())
    }
}

fun main() {
    val fb = FizzBuzz()
    //val fizzBuzz = fb.traditionalFizzBuzz(15)
    val fizzBuzz = fb.optimizedFizzBuzz(15)
    println(fizzBuzz)
}