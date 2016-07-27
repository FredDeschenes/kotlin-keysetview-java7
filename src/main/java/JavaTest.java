import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class JavaTest {
    private final ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    private final Set<String> keys = map.keySet();
//    private final ConcurrentHashMap.KeySetView<String, String> thisWontCompileIfUncommented = map.keySet();
}
