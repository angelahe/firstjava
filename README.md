# firstjava
https://app.pluralsight.com/course-player?clipId=936c9d2a-9692-46b8-b180-bc84d2e8c126
text: Java - a beginner's guide, 8th edition Herbert Schildt

## download latest JDK
jdk.java.net

## to compile and run from command line
> javac Hello.java
> java Hello
> 

## keywords in Java
abstract    assert      boolean     break       byte        case
catch       char        class       const       continue    default
do          double      else        enum        exports     extends
final       finally     float       for         goto        if
implements  import      instanceof  int         interface   long
module      native      new         open        opens       package
private     protected   provides    public      requires    return
short       static      strictfp    super       switch      synchronized
this        throw       throws      to          transient   transitive
try         uses        void        volatile    while       with

## in IDE
Alt + Enter on missing libraries to autoimport

## problems encountered
creating jar file using the latest openjdk version gave an error,
tried to troubleshoot:
https://www.baeldung.com/java-lang-unsupportedclassversion
tried creating jar files from IDE and from command line, both get the same error

Error: LinkageError occurred while loading main class out.production.firstjava.titleui.Main
java.lang.UnsupportedClassVersionError: out/production/firstjava/titleui/Main has been compiled by a more recent version of the Java Runtime (class file version 60.0), this version of the Java Runtime only recognizes class file versions up to 59.0
