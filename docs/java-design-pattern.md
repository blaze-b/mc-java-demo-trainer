# JAVA Design Patterns

- Code should be written like poetry
- Authors of Design patterns are Gang of Four, Erich Gamma, Richard Helm, Ralph Johnson and John Vlissidies in the year
  1994

## Follow Pattern Categories

- Whenever 'new' is called use - `Creational`
- Use of class hierarchies and relationships - `Structural`
- Increase the flexibility in carrying out communication - `Behavioral`

## Better Coding Should bring in easier understandability

## Design first Approach

- Instead of beating around the bush and jumping to coding right away, first analyse the requirements and design the
  solution
- Before even making a single line of code change, understand the design flow, that might take time initially but would
  save a lot of time later and avoid run necessary bugs and issues
- Use flow charts, data flow diagrams, time sequence diagrams and all other design tools available to draw and
  understand design

## Successful Software

- A successful software in one which is secure, usable, performs well and satisfies all user requirements
- This can be achieved with correct design and accurate implementation

## Journey of creating Successful Software

- On the journey of creating successful software several engineers have faced commonly occurring design issues related
  to memory leak, object creation, classes structuring, components communication and wiring.

- Documented these problems and solutions for other engineers benefit as design patterns

## Design Pattern

- Design pattern is a general repeatable solution to a commonly occurring problem in a software design.
- It includes some of the best practices adapted by experienced object-oriented software developers.
- It describes the problem, the solution, when to apply the solution, and its consequences
- It is a ready-made templates that can be applied to your own designs to solve common problems which could be related
  to object creation, object communication, class structuring or anything else
- It gives a leg-up in creating flexible and maintainable object-oriented systems

## Advantages

- Makes your life easier by not reinventing the wheel.
- Use the power of a shared vocabulary
- Solve issues even before they become visible
- Better code quality
- Improve your object-oriented skills
- Recognise the patterns in libraries and languages
- Give you an extra edge for job and promotion

## Anti-pattern of Software

- Spaghetti Code
- Cut-and-Paste Programming

## Design Patterns are language independent

## Object Inheritance

- It is a mechanism in which one object acquires all the properties and behaviours of the parent object
- It allows programmers to create classes that are built upon existing classes, to specify a new implementation to
  maintain the same behaviour to reuse code
- Inheritance causes issues which coding as changes in the base classes will require more QA testing

## Code re-usability

- Is your code dry or wet?
    - DRY - Don't Repeat Yourself is a software development principle, the main aim of which is to reduce repetition of
      code
    - WET - Write Every Time is a cheeky abbreviation to mean the opposite, that is, code that doesn't adhere to DRY
      Principle
    - Bad Software Characteristics - Rigidity, Fragility, Immobility
    - Software Design Principles
        - `S.O.L.I.D` acronym
        - It stands for:
            - `S` Single responsibility principle
            - `O` Open Closed Principle
            - `L` Liskov substitution principle
            - `I` Interface segregation principle
            - `D` Dependency inversion principle

## Cyclomatic Complexity

- Lower the program's cyclomatic complexity, lower the risk to modify and easier to understand
- Formula - `E-N+2*P`
    - `E` = number of edges in the flow graph
    - `N` = number of nodes in the flow graph
    - `P` = number of nodes that have exit points

## Tight Coupling

- It is when a group of classes is highly dependent on a one another
- Minor changes in one class creates a ripple effect and causes modification in too many changes
- Interface helps in decoupling

## Recognise the pattern of problems ans design solutions

- Be a software doctor
- Understand the memory issue
- Recognise the pattern of problems and design solutions around it

## Design Patterns Categorization

- What is an Object ?
    - An object consist of:
        - `State` represented by attributes or properties of an object
        - `Behaviour` represented by methods of an object
        - `Identity` gives a unique identifier to an object also called as reference object
- Philosophy behind Categorization
    - Object is created from a class which has certain behaviour and is structured in certain way to communicate:
        - Creational Patterns,
            - It defines the best possible way to instantiate an object while hiding the creation logic
            - Types:
                - Builder
                - Singleton
                - Factory Method
                - Abstract Method
                - Prototype
        - Structural Patterns,
            - It describes how objects and classes can be combined to form larger structures
            - Types:
                - Adaptor
                - Bridge
                - Composite
                - Decorator
                - Facade
                - Proxy
        - Behavioral Patterns,
            - Patterns specifically concerned with communication (interaction) between the objects. The interactions
              between the objects should be such that they are talking to each other and still are loosely coupled,
            - Types
                - Strategy
                - Command
                - Interpreter
                - Iterator
                - Chain of Responsibility
                - Mediator
                - Memento
                - Observer
                - State
                - Template
                - Visitor

## Design Patterns used in the Spring Framework

- Singleton Pattern
- Factory Pattern
- Template Patterns
- Observer-Observable
- Proxy

## Creational Design Pattern

## Singleton Design Pattern

- The Singleton pattern restricts the instantiation of a class to single object
- This is used when one object is needed to coordinate the actions across the system
- When to use:
    - Application needs one and only instance of an object
    - Additionally, lazy initialization and global access are necessary and state of objects needs to be shared

## Prototype Design Pattern

- It is a creational design pattern and is used when the type of objects to create is determined by a prototypical
  instance, which is cloned to produce new objects.
- When to use: When application needs to create a number of instances of a class, which has almost same state and when
  there is need to avoid creating objects using new keyword

## Builder Design Pattern

- It hides the complexity of object
- It encapsulates creating and assembling the parts of a complex object in a separate Builder Object
- When to use: Applications need to create complex objects of different types in multiple steps and expect a final
  object as outcome

## Factory Design Pattern

- It exposes the object without exposing the creation logic to the client and refer to a newly created using a common
  interface
- Intention:
    - When defining a "virtual" constructor
    - Define an interface for the creating of objects(IOC)
- Used only when we have a super class with multiple subclasses and based on input one of the subclasses is expected
  to be returned

## Abstract Factory Design Pattern

- It is also called as factory of factories, and it works around a super-factory which creates
  other factories
- An interface is responsible for creating a factory of related objects without explicitly specifying
  their classes
- Intention:
    - It provides an interface for creating  families of related or dependent objects without specifying
      their concrete classes
    - It helps in the encapsulation
- When to use: When application needs a level of indirection that abstracts the creation of families of
  related or dependent objects without directly specifying their concrete class