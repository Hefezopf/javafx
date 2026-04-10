# HelloFX Sample

JavaFX HelloFX sample to run with different options and build tools.

Download [JDK 17 or later](http://jdk.java.net/) for your operating system.
Make sure `JAVA_HOME` is properly set to the JDK installation directory.
Make sure `PATH_TO_FX` is properly set to the JavaFx installation directory. 

## Maven

### Linux

If you run on Linux or Mac, follow these steps:

    cd .
    
To compile and run the project:
    
    mvn clean javafx:run


## CLI

### Linux

To compile:

    javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml -classpath ./src/main/java ./src/main/java/HelloFX.java -d target/classes

and run the project:

    java --module-path $PATH_TO_FX --add-modules javafx.controls -classpath target/classes HelloFX

