Fibonacci Numbers
=================

This is a simple library of Fibonacci number solvers. Each implementation has two algorithms.

Algorithms
----------

### Fast

This implementation figures out each number sequentially, holding on to only the last two. Complexity: O(N)

### Slow

This implementation calls itself recursively until it gets to the first and second numbers. Complexity: O(2^N)

Usage
-----

### Ruby

    ruby fibonacci.rb <number> [number...]
