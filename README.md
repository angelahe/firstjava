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
_

const and goto are reserved but not used
also reserved: true, false, null, var

Variable names:
[A..Z|a..z|_|$][A..Z|a..z|0..9|$|_]*

Primitive types:
boolean - true/false, byte -128 to 127, char, double, float, int, long, short
byte = 8 bit = -128 to 127
short = 16 bit = -32768 to 32767
int = 32 bit = -2147483648 to 21474843647
long = 64 bit = -9223372036854775808 to 9223372036854775807
float = 32 bit
double = 64 bits

## TODO challenges
write a MathTest class and tests for Math.max() and Math.min()

## Reference sites
```bash
https://introcs.cs.princeton.edu/java/11cheatsheet/
set up junit 5 

https://www.youtube.com/watch?v=Z8V7rnvDeB4
https://learning.oreilly.com/videos/learn-java-unit/9781789340648/

https://github.com/in28minutes/spring-unit-testing-with-junit-and-mockito
Intellij
https://www.jetbrains.com/help/idea/configuring-testing-libraries.html
https://blog.jetbrains.com/idea/2016/08/using-junit-5-in-intellij-idea/
Spring & Spring Boot Framework - https://www.youtube.com/watch?v=PSP1-2cN7vM&t=893s
Introduction to JPA and Hibernate using Spring Boot Data Jpa - http://www.springboottutorial.com/introduction-to-jpa-with-spring-boot-data-jpa
Functional Programming - https://youtu.be/aFCNPHfvqEU
JUnit - https://junit.org/junit5/docs/current/user-guide/
AssertJ - https://joel-costigliola.github.io/assertj/
Mockito - https://github.com/mockito/mockito/wiki/FAQ
JsonPath - https://github.com/json-path/JsonPath
Setting up JUnit 5 with Mockito and Spring Boot 2.0 - https://medium.com/@dSebastien/using-junit-5-with-spring-boot-2-kotlin-and-mockito-d5aea5b0c668
Good Unit Testing
https://github.com/mockito/mockito/wiki/How-to-write-good-tests
FIRST. https://pragprog.com/magazines/2012-01/unit-tests-are-first
Patterns - http://xunitpatterns.com
Mocking Static, Private Methods and Constructors
https://github.com/in28minutes/MockitoTutorialForBeginners/blob/master/Step15.md
https://github.com/in28minutes/MockitoTutorialForBeginners/tree/master/src/test/java/com/in28minutes/powermock

```
https://introcs.cs.princeton.edu/java/11cheatsheet/

## Common libraries
Standard
Math (Math.sqrt)

## File I/O
File


## main principles of Java
In the most general sense, a program can be organized in one of two ways: around its code (what is happening) or around its data (what is being affected). 
They are organized around data, with the key principle being “data controlling access to code.” In an object-oriented language, you define the data and the routines that are permitted to act on that data.

Encapsulation
Encapsulation is a programming mechanism that binds together code and 
the data it manipulates, and that keeps both safe from outside 
interference and misuse. In an object-oriented language, code and data 
can be bound together in such a way that a self-contained black box is created.

Within the box are all necessary data and code. When code and data are linked 
together in this fashion, an object is created. In other words, an object is 
the device that supports encapsulation.

Within an object, code, data, or both may be private to that object or public. 
Private code or data is known to and accessible by only another part of the 
object. That is, private code or data cannot be accessed by a piece of the 
program that exists outside the object.

a class is essentially a set of plans that specify how to build an object.
The code and data that constitute a class are called members of the class. 
Specifically, the data defined by the class are referred to as member 
variables or instance variables. The code that operates on that data is 
referred to as member methods or just methods.

Polymorphism
Polymorphism (from Greek, meaning “many forms”) is the quality that allows 
one interface to access a general class of actions. The specific action is 
determined by the exact nature of the situation. 

consider a stack (which is a first-in, last-out list). You might have a program 
that requires three different types of stacks. One stack is used for integer 
values, one for floating-point values, and one for characters. In this case, 
the algorithm that implements each stack is the same, even though the data 
being stored differs. In a non-object-oriented language, you would be required 
to create three different sets of stack routines, with each set using different 
names. However, because of polymorphism, in Java you can create one general set 
of stack routines that works for all three specific situations. This way, once 
you know how to use one stack, you can use them all.

the concept of polymorphism is often expressed by the phrase “one interface, 
multiple methods.” This means that it is possible to design a generic interface 
to a group of related activities. Polymorphism helps reduce complexity by allowing 
the same interface to be used to specify a general class of action. 

compiler’s job to select the specific action (i.e., method) as it applies to 
each situation. 

Inheritance
Inheritance is the process by which one object can acquire the properties of 
another object. This is important because it supports the concept of hierarchical 
classification. 

The apple class defines those qualities specific to an apple (grows on trees, 
not tropical, etc.). A Red Delicious apple would, in turn, inherit all the 
qualities of all preceding classes, and would define only those qualities 
that make it unique.

## in IDE
Alt + Enter on missing libraries to autoimport

## problems encountered
creating jar file using the latest openjdk version gave an error,
tried to troubleshoot:
https://www.baeldung.com/java-lang-unsupportedclassversion
tried creating jar files from IDE and from command line, both get the same error

Error: LinkageError occurred while loading main class out.production.firstjava.titleui.Main
java.lang.UnsupportedClassVersionError: out/production/firstjava/titleui/Main has been compiled by a more recent version of the Java Runtime (class file version 60.0), this version of the Java Runtime only recognizes class file versions up to 59.0
