# Java Random() Improved
Improvements on the `Math.random()` method allowing you to specify:
- An upper bound representing **range** (not just `doubles` between 0 & 1)
- A lower bound

## Double Functions
Upper bound is always excluded
- `random()`  
Returns a `double` between 0 and 1
- `random(double upperBound)`  
Returns a `double` between 0 and upperBound
- `random(double lowerBound, double upperBound)
Returns a `double` between `lowerBound` and `upperBound`

## Integer Functions  `randInt()`
- `randInt()`  
Returns an integer between 0 and `Integer.MAX_VALUE` (like `Random` class `nextInt()` )
- `randInt(int upperBound)`  
Returns an integer between 0 and `upperBound`  
**EXCLUDING `upperBound`**
- `randInt(int lowerBound, int upperBound)`  
Returns an integer between `lowerBound` and `upperBound`  
**INCLUDING `upperBound`**
