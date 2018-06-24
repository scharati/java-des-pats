The first cut implementation
It piggy backs on the JVM's capability to load the class and initialize static 
variables. The class is loaded only once and stays loaded until the JVM shuts
down. Hence once user gets the instance using getInstance() it stays there.

It is not thread safe. It may so happen that during the call to getInstance
some one can get another copy
