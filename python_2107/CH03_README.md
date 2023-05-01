## Operand & Operators
- Operands are the value on whom we perform operation.

- Operators define the operation for given operands _Value_.

# Types Operators
## 1 : Arithmetics
1. Addition
Which is used to add to operands. Wheather it is int or float.denoted by '+'

```python
a = 10
b = 20
c = a+b
```
2. Substraction:
Which  is used to substract one operand from another operands. denoted by '-'
```python
a = 10
b = 4
c = a-b
```
3. multication
Which is used to multipy 2 operands. denoted by '*' sign.
```python
a = 10
b = 4
c = a*b
```
4. division
which is used to divide one operand with another operand and return float value. denoted by '/'
```python

a = 94
b = 2
c = a/b
```
5. integer division
which is used to get int value from division result. which is denoted by '//'

```python
a = 5
b = 2
c = a//b
```


6. modulo
which is used to find reminder after division of 2 operands. denoted '%'

```python
a = 2
b = 3
c = a%b
```

7. exponetial (power)
This operator used to find power of given operand by another operand. denoted by '**'

```python
a = 39
b = 3
c = a**b
```
## 2 : Relational
this operators used to compare operands & return `True` if comparision is valid or `False`
1. `>` greater than.
return True if first operand is greater than second one.
```python
a = 30
b = 3
c = a>b
``` 
2. `<` less than.
return True if second operand is less than first operand.
```python
a = 20
b = 10
c = a<b
```
3. `>=` greater than or equals to
return True if first operand is greater or equals to second one.
```python
a = 10
b = 3
c = a>=b
```
4. `<=` less than or equals to
return True if second operand is less than or equals to first one.
```python
a = 3
b = 10
c = a<=b
```
5.`!=` not equals to
return True if both operand is different.
```python
a = 10
b = 3
c = a!=b
``` 
6. `==` equals to equals to
return True if both operand is same.
```python
a = 10
b = 10
c = a==b
```
## 3 : logical
logical operators are usefull when you want to make a decision from 2 or more expression.

1. and
which is used to check wheater all conditions(expressions) are true then return true.
```python
if marks>=33 and marks<=100:
    print("pass")
else:
    print("better luck next time")
```

2. or 
which is used to check wheather any of given condition(expression) is true. then return true or false.
```python

if username =="harsh" or username=="HARSH":
    print("Welcome")
else:
    print("Bye..")
```

3. not
which is used to reverse the condition.
```python

if not username=="123":
    print("not enough");
else:
    print("welcome./.")
```
## 4 : bitwise
Bitwise operators used to perform operations on binary level

1. bitwise AND 
which is used to perform `and` operation on corresponding bits. which is denoted by &
```python
a = 7
b = 3

c = a&b
```

2. bitwise OR
which is used to perform `or` operation on bits. which is denoted by |
```python

a = 6
b = 3
c = a|b
```


## 5 : assignment
assignment operators used to assign a value to the one of operand after operation.
```python

a +=b # a = a+b
a -=b # a = a-b
a *=b # a = a*b
a /=b # a = a/b
a %=b # a = a%b
a **=b # a = a**b
```
## 6 : membership
this operator used to check whether a operand available or not in the given group/collection. it gives boolean value after operation.
which is denoted by `in` keyworkd
```python
fruits = ["apple","Banana","Cherry"]
x = "apple" in fruits
```
## 7 : Indentity
This operator used to check wheter both operand has same value with same memory reference.
which is denoted by `is` keyword.

```python
a = 10
b = 10

if a is b:
    # code
else:
    # code
```

