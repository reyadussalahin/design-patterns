<h1 align="center">Design Patterns</h1>
<p align="center">But now Makes Sense</p>
<p align="center">
    <span>
        <a href="https://github.com/reyadussalahin/design-patterns/stargazers">
            <img alt="Stars" src="https://img.shields.io/github/stars/reyadussalahin/design-patterns?style=flat&color=magenta">
        </a>
    </span>
    <span>
        <a href="https://github.com/reyadussalahin/design-patterns/pulls">
            <img alt="PRs" src="https://img.shields.io/github/issues-pr/reyadussalahin/design-patterns?style=flat">
        </a>
    </span>
    <span>
        <a href="https://github.com/reyadussalahin/design-patterns/issues">
            <img alt="Issues" src="https://img.shields.io/github/issues/reyadussalahin/design-patterns?style=flat&color=orange">
        </a>
    </span>
    <span>
        <a href="https://github.com/reyadussalahin/design-patterns/network/members">
            <img alt="Forks" src="https://img.shields.io/github/forks/reyadussalahin/design-patterns?style=flat">
        </a>
    </span>
    <span>
        <a href="https://github.com/reyadussalahin/design-patterns/blob/main/LICENSE">
            <img alt="License" src="https://img.shields.io/github/license/reyadussalahin/design-patterns?color=teal&style=flat">
        </a>
    </span>
</p>
<hr>
<p align="center">
Design Patterns is, without any doubt one of the most hard to grasp topics in SE. One of the reason is, even after understanding patterns theoretically, it's very hard to track down it's usecase in real life applications. Design Patterns are often misunderstood/misused, just to create more problems than solving them. Our attempt here is to provide very good, yet easy to understand real life applications of design patterns, so that one may grasp the concept properly as well as understand it's practical usage with merits and demerits.
<hr>


<sub>Connect with me in [linkedin](https://www.linkedin.com/in/reyadussalahin/) or maybe say hi to [Twitter](https://twitter.com/reyadussalahin).</sub>


Introduction
-------------------
-------------------


Types of Design Patterns
-------------------
- [Creational](#creational-design-patterns)
- [Structural](#structural-design-patterns)
- [Behavioral](#behavioral-design-patterns)



Creational Design Patterns
-------------------
-------------------
- Simple Factory
- Factory Method
- Abstract Factory Method


Structural Design Patterns
-------------------
-------------------
- Adapter
- Decorator
- Facade

Behavioral Design Patterns
-------------------
-------------------
- [Strategy](#-strategy)
- Chain of Responsibility
- Iterator
- Observer

👉 Strategy
-------------------
**Real World Problem**
> Sasha is learning various sorting algoritms. She's learning `selection sort` now, but she knows in future, she's going to learn `insertion sort`, `quick sort`, `merge sort` etc. But right now, she's also building a library that can help her with sorting integer numbers. So, she wants to build the library in such a way that she can change the underlying sorting algorithm without changing the other parts of codebase where the sorting functionality is being called.

**To put Simply**
> Strategy pattern provides a way to select an algorithm's behavior at runtime.

**Code example**

Consider an interface that provides a method for sorting integer array.

```java
public interface SortingStrategy {
    public Integer[] apply(Integer[] array);
}
```

Now consider classes two different strategy insertion sort and selection sort where both classes implements `SortingStrategy`.

```java
// insertion sort
@Slf4j
public class InsertionSort implements SortingStrategy {
    public Integer[] apply(Integer[] array) {
        log.info("Sorting strategy: Insertion Sort");

        // performing insertion sort
        Integer[] buf = Arrays.copyOf(array, array.length);
        
        for(int i=0; i<buf.length; ++i) {
            int j = i-1, key = buf[i];
            while(j >= 0 && key < buf[j]) {
                buf[j+1] = buf[j];
                --j;
            }
            buf[j+1] = key;
        }

        return buf;
    }
}

// selection sort
@Slf4j
public class SelectionSort implements SortingStrategy {
    public Integer[] apply(Integer[] array) {
        log.info("Sorting strategy: Selection Sort");

        // performing selection sort
        Integer[] buf = Arrays.copyOf(array, array.length);

        for(int i=0; i<buf.length; ++i) {
            int x = i;
            for(int j=i+1; j<buf.length; ++j) {
                if(buf[j] < buf[x]) {
                    x = j;
                }
            }
            int t = buf[x];
            buf[x] = buf[i];
            buf[i] = t;
        }

        return buf;
    }
}
```

Now, one can easily switch the `strategy` they choose:

```java
Integer[] array = {1, 9, 8, 7, 4, 2, 0};

log.info("Unsorted Array: " + Arrays.toString(array));

SortUtil sortUtil = new SortUtil(new InsertionSort());
Integer[] sortedArray = sortUtil.sortIntegerArray(array);
log.info("Sorted Array: " + Arrays.toString(sortedArray));

sortUtil = new SortUtil(new SelectionSort());
sortedArray = sortUtil.sortIntegerArray(array);
log.info("Sorted Array: " + Arrays.toString(sortedArray));
```

**You can find the full example code [here](strategy/).**


## License
This repository is published under `MIT License`. To know more about license please visit [this link](LICENSE).

## Contributing
I'll continue to improve this repository. So, watch this repo. If you want to contribute, please read [this guide](CONTRIBUTING.md).
