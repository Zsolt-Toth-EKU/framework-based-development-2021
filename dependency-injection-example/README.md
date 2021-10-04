# Dependency Injection

## Prerequisites 

 - Object Instantiation
   - Memory Allocation
   - Constructor Invocation
   - this / super Constructors
   - Field Initialization
    
 - Polymorphism
   - Static vs Dynamic Types
   - Late Binding

- SOLID Principles
    - Single Responsibility
    - Open -- Closed
    - __Liskov Substitution__
    - Interface Segregation
    - __Dependency Inversion__

### Static vs Dynamic Type
```java
TaxCalculator calculator = new DefaultTaxCalculator();
```
variable name: calculator \
Static Type: TaxCalculator \
Dynamic Type: DefaultTaxCalculator

#### Initialization in Constructor or Method

````java
class TaxCalculatingService{
    private TaxCalculator calculator;
    
    public TaxCalculatingService(){
        this.calculator = new DefaultTaxCalculator();
    }
}
````

##### Problems?

 - DefaultTaxCalculator is hard coded.
 - Changing DefaultTaxCalculator requires Compilation.
 - There are as many DefaultTaxCalculator objects as TaxCalculatingService objects.
 - Cannot share resources!
 - Bugs / Failures in DefaultTaxCalculator affect on TaxCalculatingService!
 - Tight Coupling
 - Hard to Test

#### Ask Dependencies instead of Initialization

```java

class TaxCalculatingService{
    private TaxCalculator calculator;

    public TaxCalculatingService(TaxCalculator calculator){
        this.calculator = calculator;
    }
}

public static void main(String[] args){
    TaxCalculator calculator = new DefaultTaxCalculator();
    TaxCalculatingService service = new TaxCalculatingService(calculator);
}
```

#### Advantanges
 
 - Loose Coupling of TaxCalculatingService and TaxCalculator
 - TaxCalculatingService should not be recompiled.
 - Open-Close Principle (add new TaxCalculatorImplementaions)
 - TaxCalculatingService is easier to test.

##### Problems

 - Main method should be recompiled for configuration.

## Dependency Injection

Ask your dependencies. Do not initialize them. 

### Types:
 - Field Injection (Autowired): Do not use!
 - Setter Method Injection: Optional Dependencies
 - Constructor Injection: Mandatory Dependencies

#### Notes:
 - Service Locator Architectural Pattern
 - Reflection 
