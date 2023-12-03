# learn-functional-programming

## Java Examples

### Simple Statement with one Calculation

```java
public class LearnFnProg{
  private static void printAllNumbers(List<Integer> numbers){
    numbers.stream()
            .forEach(LearnFnProg::print); //method reference only, no invocation
  }

  private static void print(int number){
    System.out.println(number);
  }


  private static void printEvenNumbers(List<Integer> numbers){
    numbers.stream()
            .filter(LearnFnProg::isEven)
            .forEach(print); //method reference only, no invocation
  }

  private static boolean isEven(int number){
    return(number%2 == 0);
  }
}

```

### Rewrite the above using Lambda Expression

```java
private static void printEvenNumbers(List<Integer> numbers){
    numbers.stream()
            .filter(number -> number%2 ==0)
            .forEach(print); //method reference only, no invocation
}
```
