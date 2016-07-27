import java.util.concurrent.ConcurrentHashMap

class KotlinTest {
    private val map = ConcurrentHashMap<String, String>()
    // This will be a ConcurrentHashMap.KeySetView<String> instead of a Set<String> like in the Java class
    val untypedKeys = map.keys
    // This one will work!
    val typedKeys: Set<String> = map.keys
}
