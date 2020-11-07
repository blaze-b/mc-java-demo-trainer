# Java 8 Essential Training

- Java 11 and the java 8 are the two stable versions
- Java 11 uses the Type Inference i.e usage of 'var'

## History

- A new portable language
- Original Name: Oak
- Tag line: Write once, Run Everywhere

---------------------------Image

## Principles of JAVA

- Simple, Object-oriented, and familiar
- Robust and secure(Methods, properties and Debugging)
- Architecture-neutral and portable
- High-performance
- Interpreted, threaded(more than one processes) and dynamic

## Runtime Architecture

- It is an interpreted language.
- It compiles the bytecode instead of machine language
- The compiled application is portable between platforms without recompiling(JVM)

------------------------Image

## Java and JavaScript

-----------------------Image

## Java features

- Java Platform, Micro Edition(ME) (Micro-Controller, sensors and mobile devices)
- Java Runtime Environment (Java SE Runtime Environment (JRE) includes JVM),
Supported on Windows, Linux, OS X and Solaris, Runs all java applications: desktop, browser and server,
Must be updated to keep up with the security issues, Mobile operating systems have their own runtimes.
- Java development kit(JDK): It is a no cost from ORACLE, Include tools for the compilation and packaging<br>
&nbsp;&nbsp;&nbsp;&nbsp; java: runtime<br>
&nbsp;&nbsp;&nbsp;&nbsp; javac: compiler<br>
&nbsp;&nbsp;&nbsp;&nbsp; javadoc: docs builder<br>
&nbsp;&nbsp;&nbsp;&nbsp; jar: archive builder<br>

## Creating the JAVA classes

- All codes are defined in classes
- Classes are defined in the src code files with .java extensions
- javac command compiles Java code into byte code

## Identifier Conventions

- Classes start with the uppercase character, class MyClass{}
- Methods and variables start with the lowercase character.<br>
void doSomething(){
}
- Constants are always UpperCase
public static final String FIRST_NAME = "david";

## Memory management and Garbage collection

- Automatic Memory Management (Memory for objects is allocated automatically)
- Objects are created in the heap memory
- As long as any variable references an object, its's retained
- When all the references expire, then it is available for the garbage collection

## Reference Expire?

- Variables local to methods or code blocks expire with scope,<br>
void checkString(){
 String localVar = "Test String";
 System.out.println("Tes"+localVar);
}
- We can deference variable with the null keyword,
String tempVar = "Test string";
tempVar = null;

## Java Garbage Collection






