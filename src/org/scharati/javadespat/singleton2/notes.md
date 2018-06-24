Thread safe option #1: Eagerly created instance as opposed to lazily created

JVM ensures that the static variables are initialized before anyone can access.
So we can be sure that no one would create another instance of Singleton