# Data Structures and Algorithms Checkpoint

## Checkpoint

Verify your understanding of Arrays, ArrayLists, HashMaps, and the Accumulator Pattern with the following exercise.

## Functional requirements

Write _and test_ 3 methods:
<br><br>

#### Method #1: `allEqual`

Within the `Algorithm` class, define a method named `allEqual` that:

- Takes a String argument
- Returns `true` if every letter in the string is the same (case-insensitive)
    - Otherwise returns `false`

Examples:

```java
Algorithm algorithm = new Algorithm();
algorithm.allEqual("aAa");      // => returns true
algorithm.allEqual("bbBbabbb"); // => returns false
algorithm.allEqual("");         // => returns false
```
<br><br>

#### Method #2: `letterCount`

Within the `Algorithm` class, define a method named `letterCount` that:

- Takes a String argument
- Returns a Map of the form `<String, Long>` where:
    - The keys are the characters of the string (lowercase)
    - The values are the number of times those characters appear in the string (case-insensitive)

Examples:

```java
Algorithm algorithm = new Algorithm();
algorithm.letterCount("aa");      // => returns { a=2 }
algorithm.letterCount("abBcd");   // => returns { a=1, b=2, c=1, d=1 }
algorithm.letterCount("");        // => returns {}
```
<br><br>

#### Method #3: `interleave`

Within the `Algorithm` class, define a method named `interleave` that:

- Takes two Lists of Strings (you can assume both arrays are of the same length).
- Returns a string with the lists interleaved.

Examples:

```java
Algorithm algorithm = new Algorithm();
algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"));  // => returns "adbecf"
algorithm.interleave(Arrays.asList("a", "c", "e"), Arrays.asList("b", "d", "f"));  // => returns "abcdef"
algorithm.interleave(Collections.emptyList(), Collections.emptyList());            // => returns ""
```
<br><br>

## Technical requirements

- Write tests in `src/test`.
- Make sure that your test coverage is 90% or higher.


For this checkpoint:

1. Fork and clone the `java-algorithms-checkpoint` repo provided by your instructor.
1. Write code to complete the checkpoint.
1. Once you are satisfied with your solution, check your work:
- Run `./assess-project` (just `assess-project` on Windows) locally and make sure the tests pass.
1. Commit and push your changes to _your_ fork.
1. Submit the link to your fork in Learn.
