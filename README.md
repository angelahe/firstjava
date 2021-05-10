# firstjava

## download latest JDK
jdk.java.net

## to compile and run from command line
> javac Hello.java
> java Hello
> 

## in IDE
Alt + Enter on missing libraries to autoimport

## problems encountered
creating jar file using the latest openjdk version gave an error,
tried to troubleshoot:
https://www.baeldung.com/java-lang-unsupportedclassversion
tried creating jar files from IDE and from command line, both get the same error

Error: LinkageError occurred while loading main class out.production.firstjava.titleui.Main
java.lang.UnsupportedClassVersionError: out/production/firstjava/titleui/Main has been compiled by a more recent version of the Java Runtime (class file version 60.0), this version of the Java Runtime only recognizes class file versions up to 59.0
