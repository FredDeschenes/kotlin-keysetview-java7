Bug report to Kotlin devs for [this issue](https://youtrack.jetbrains.com/issue/KT-13258).

# Reproducing the issue
- Make sure your `JAVA_HOME` points to a JDK7
- `gradlew clean build`
- Rename the `build` directory to `buildjdk7`
- Switch your `JAVA_HOME` to a JDK8
- Compare the .class files in `build/classes` and `buildjdk7/classes` with your favorite decompiler

`build/classes/KotlinTest.class` should have a variable typed `ConcurrentHashMap.KeySetView`, but not `build/classes/JavaTest.class`
