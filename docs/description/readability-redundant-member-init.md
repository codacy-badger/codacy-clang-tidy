# readability-redundant-member-init

Finds member initializations that are unnecessary because the same
default constructor would be called if they were not present.

Example:

``` c++
// Explicitly initializing the member s is unnecessary.
class Foo {
public:
  Foo() : s() {}

private:
  std::string s;
};
```
