import java.io.File

/**
 * Kotlin学习示例
 */

fun main(args: Array<String>) {

    // String Interpolation
    val myName = "ChenKan";
    println("Name: $myName");

    // Read-only list & Filter
    val numbers = listOf(1, 2, 3, 4, 6);
    println(numbers.filter { it % 2 == 0 });

    // Mapping
    println(numbers.map { it * it });

    // Read-only map & Traverse
    val dict = mapOf("a" to "adam", "b" to "ben", "c" to  "chen");
    for ((k, v) in dict) {
        println("$k -> $v");
    }

    // singleton
    println(Resource.size);

    // If not null shorthand
    var files = File("Test").listFiles();
    println(files?.size);

    files = File("/").listFiles();
    println(files?.size);

    // enum
    println(State.INIT);
    println(State.START.desc);
    println(State.valueOf("END").code);
    println(getStateByCode(2));
}

// Creating a singleton
object Resource {
    val size = "1024KB";
}

// enum
enum class State(val code: Int, val desc: String) {
    INIT(0, "Init"),
    START(1, "Start"),
    END(2, "End");

}

fun getStateByCode(code: Int): State {
    return when (code) {
        0 -> State.INIT;
        1 -> State.START;
        2 -> State.END;
        else -> throw IllegalArgumentException("Invalid Code");
    }
}
