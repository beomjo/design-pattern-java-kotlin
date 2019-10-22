# :slot_machine: DesignPattern Sample with Java, Kotlin

## Summary
A project to see design patterns as Java Kotlin samples  
<br/> 
## Link
<https://beomseok95.tistory.com/category/DesignPattern>  
<br/> 
## Contents
- [Creational](#creational)
  * [Builder](#builder)
  * [Singleton](#singleton)
  * [FactoryMethod](#factorymethod)
  * [AbstractFactory](#abstractfactory)
  * [Prototype](#prototype)
- [Structural](#structural)
  * [Adapter](#adapter)
  * [Bridge](#bridge)
  * [Composite](#composite)
  * [Decorator](#decorator)
  * [Facade](#facade)
  * [Proxy](#proxy)
  * [Flyweight](#flyweight)
- [Behavioral](#behavioral)
  * [Chain_of_Responsibility](#chain-of-responsibility)
  * [Command](#command)
  * [Interpreter](#interpreter)
  * [Iterator](#iterator)
  * [Mediator](#mediator)
  * [Memento](#memento)
  * [Observer](#observer)
  * [State](#state)
  * [Strategy](#strategy)
  * [Visitor](#visitor) 
  * [TemplateMethod](#templatemethod)  
<br/> 
<br/> 
<br/>

## Creational
These design patterns are all about class instantiation. This pattern can be further divided into class-creation patterns and object-creational patterns. While class-creation patterns use inheritance effectively in the instantiation process, object-creation patterns use delegation effectively to get the job done.  
이러한 디자인 패턴은 모두 클래스 인스턴스화에 관한 것입니다. 이 패턴은 클래스 생성 패턴과 객체 생성 패턴으로 세분 될 수 있습니다. 클래스 작성 패턴은 인스턴스화 프로세스에서 상속을 효과적으로 사용하지만 오브젝트 작성 패턴은 위임을 효과적으로 사용하여 작업을 완료합니다.
<br/> 

### Builder
Separates object construction from its representation  
객체의 생성자에서 파라미터를 분리합니다.
<br/>  
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/creational/builder/BuilderTest.kt)   
<br/>  

### Singleton
A class of which only a single instance can exist  
인스턴스가 단 한개만 존재하도록 합니다.
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/creational/singleton/kt/SingletonKt.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/creational/singleton/ja/HolderSingleton.java)
<br/>  

### FactoryMethod
Creates an instance of several derived classes  
한개의 메소드로 여러 파생 클래스의 인스턴스를 얻습니다.
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/creational/factorymethod/FactoryMethodTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/creational/factorymethod/ja/ex2/ShapeClient.java)
<br/>  

### AbstractFactory
Creates an instance of several families of classes  
많은 수의 연관된 서브 클래스를 특정 그룹으로 묶어(Factory) 한번에 교체할 수 있도록 만든 디자인패턴입니다.
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/creational/abstractfactory/AbstractFactoryTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/creational/abstractfactory/ja/ex2/client/Client.java)
<br/>  

### Prototype
A fully initialized instance to be copied or cloned  
기존 생성되어있는 인스턴스를 복사 하여 새로운것을 만듭니다.
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/creational/prototype/kt/BikeTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/creational/prototype/ja/ProtoTypeServiceTest.java)
<br/>  
<br/> 
<br/> 

---
<br/> 
<br/> 
<br/> 

## Structural
These design patterns are all about Class and Object composition. Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways to compose objects to obtain new functionality.  
이러한 디자인 패턴은 모두 클래스 및 객체 구성에 관한 것입니다. 구조적 클래스 작성 패턴은 상속을 사용하여 인터페이스를 구성합니다. 구조적 객체 패턴은 객체를 구성하여 새로운 기능을 얻는 방법을 정의합니다.
<br/>

### Adapter
Match interfaces of different classes  
한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환하는 패턴입니다.
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/structural/adapter/AdapterTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/adpater/ja/TicketMachine.java)
<br/>  

### Bridge
Separates an object’s interface from its implementation  
객체의 인터페이스를 구현된 객체로부터 분리하여  
각자 독립적으로 변형할 수 있습니다.
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/bridge/kt/Client.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/structural/bridge/BridgePatternTest.java)
<br/>  

### Composite
A tree structure of simple and composite objects  
객체들의 관계를 간단한 트리구조로 구성하여 부분-전체 계층을 표현합니다.  
단일 객체와 복합 객체 모두 동일하게 다루도록 하는 패턴입니다.
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/composite/kt/playlist/Client.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/composite/ja/graphic/Program.java)
<br/>  

### Decorator
Add responsibilities to objects dynamically  
객체에 추가적인 요건을 동적으로 첨가합니다.  
데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공합니다.
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/structural/decorator/DecoratorTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/decorator/ja/Client.java)
<br/>  

### Facade
A single class that represents an entire subsystem  
하나의 클래스가 여러 서브클래스를 대표하여 복잡한 구조를 처리하는 패턴입니다.
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/structural/facade/FacadeTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/facade/ja/Client.java)
<br/>  

### Proxy
An object representing another object   
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/structural/proxy/ProtectionProxyTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/proxy/ja/use/Client.java)
<br/>  

### Flyweight
A fine-grained instance used for efficient sharing  
중복생성될가능성이 높거나, 자원생성비용이 큰 객체를 재사용하는 패턴입니다.   
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/flyweight/kt/GlyphFactory.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/structural/flyweight/ja/coffee/Client.java)
<br/>  
<br/> 
<br/> 

---
<br/> 
<br/> 
<br/> 

## Behavioral
These design patterns are all about Class's objects communication. Behavioral patterns are those patterns that are most specifically concerned with communication between objects.  
이러한 디자인 패턴은 모두 클래스의 객체 통신에 관한 것입니다. 동작 패턴은 객체 간의 통신과 가장 관련이있는 패턴입니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/creational/builder/kt/MyDialog.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/creational/builder/BuilderTest.kt)
<br/>  

### Chain of Responsibility
A way of passing a request between a chain of objects  
일련의 책임을 가진 객체간에 책임을 위임하여 자신의 책임이 아니면 다른객체로 요청을 전달합니다.  
객체간에 요청을 전달하는 방법  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/chain_of_responsibility/ex1/ChainOfResponsibilityTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/chain_of_responsibility/ja/CheckAuthority.java)
<br/>  

### Command
Encapsulate a command request as an object  
실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/command/ex2/CommandTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/command/ja/Client.java)
<br/>  

### Interpreter
A way to include language elements in a program  
문법 규칙을 클래스화 한 구조로써, 일련의 규칙으로 정의된 언어를 해석하는 패턴입니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/interpreter/InterpreterTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/interpreter/ja/InterpreterPatternDemo.java)
<br/>  

### Iterator
Sequentially access the elements of a collection  
접근 기능과 자료구조를 분리시켜 객체화합니다.  
서로 다른 구조를 가지고 있는 저장 객체에 대해서 접근하기 위해서 interface를 통일시키고 시킵니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/iterator/kt/IteratorTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/iterator/ja/Client.java)
<br/>  

### Mediator
Defines simplified communication between classes  
클래스 간의 상호작용을 하나의 클래스에 위임하여 처리하는 패턴입니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/mediator/kt/MediatorTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/mediator/ja/MediatorTest.java)
<br/>  

### Memento
Capture and restore an object's internal state  
객체의 상태 정보를 저장하고 사용자의 필요에 의하여 원하는 시점의 데이터를 복원할 수 있는 패턴입니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/memento/MementoTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/memento/ja/MementoPatternDemo.java)
<br/>  

### Observer
A way of notifying change to a number of classes  
한 객체의 상태 변화에 따라 다른 객체의 상태도 연동되도록 일대다 객체 의존 관계를 구성하는 패턴입니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/observer/kt/Client.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/observer/ja/push/Messenger.java)
<br/>  

### State
Alter an object's behavior when its state changes  
일련의 규칙에 따라 객체의 상태(State)를 변화시켜, 객체가 할 수 있는 행위를 바꾸는 패턴입니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/state/ex1/StateTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/state/ja/Client.java)
<br/>  

### Strategy
Encapsulates an algorithm inside a class  
객체가 할 수 있는 행위들을 각각의 전략으로 정의, 수정이 필요한 경우 전략을 바꾸는 것만으로도  
수정이 가능하도록 만드는 패턴입니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/strategy/StrategyTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/strategy/ja/Client.java)
<br/>  

### Visitor
Defines a new operation to a class without change  
데이터 구조와 연산을 분리하여 데이터 구조의 원소들을  변경하지 않고   
새로운 연산을 추가할 수 있는  패턴입니다.  
<br/>
[Usecase-kotlin](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/test/java/k/bs/designpatternsp/behavoral/visitor/VisitorTest.kt)   
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/visitor/ja/Client.java)
<br/>  

### TemplateMethod
Defer the exact steps of an algorithm to a subclass  
알고리즘의 정확한 단계를 하위 클래스로 연기합니다  
[Usecase-java](https://github.com/qjatjr1108/DesignPattern_Java-Kotlin/blob/master/app/src/main/java/k/bs/designpatternsp/behavioral/templatemethod/ja/HousingClient.java)  
<br/>
<br/>  
<br/>

# [Go to Top](#summary)

   
