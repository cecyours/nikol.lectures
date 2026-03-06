from django.db import models


# -----------------------------------
# 1. BASIC MODEL (NO RELATION)
# -----------------------------------
class Todo(models.Model):
    title = models.CharField(max_length=255)
    is_completed = models.BooleanField(default=False)

    def __str__(self):
        return self.title


# -----------------------------------
# 2. USER MODEL (PARENT MODEL)
# -----------------------------------
class User(models.Model):
    full_name = models.CharField(max_length=200)
    username = models.CharField(max_length=50, unique=True)
    password = models.CharField(max_length=200)
    email = models.EmailField(unique=True)

    def __str__(self):
        return self.username


# -----------------------------------
# 3. ONE-TO-ONE RELATION
# -----------------------------------
# One user -> One profile
# Used when extra information is stored separately
class Profile(models.Model):
    user = models.OneToOneField(
        User,
        on_delete=models.CASCADE,
        related_name="profile"
    )
    phone = models.CharField(max_length=15)
    address = models.TextField()

    def __str__(self):
        return f"{self.user.username} Profile"


"""
OneToOneField Meaning:
----------------------
User (1)  --------  (1) Profile

Example:
- Each user has only one profile
- Profile cannot exist without user
"""


# -----------------------------------
# 4. ONE-TO-MANY RELATION (ForeignKey)
# -----------------------------------
# One user -> Many orders
class Order(models.Model):
    user = models.ForeignKey(
        User,
        on_delete=models.CASCADE,
        related_name="orders"
    )
    order_date = models.DateTimeField(auto_now_add=True)
    total_amount = models.DecimalField(max_digits=10, decimal_places=2)

    def __str__(self):
        return f"Order {self.id} - {self.user.username}"


"""
ForeignKey Meaning:
-------------------
User (1) -------- (Many) Orders

Example:
- One user can have multiple orders
- Each order belongs to one user
"""


# -----------------------------------
# 5. MANY-TO-MANY RELATION
# -----------------------------------
class Product(models.Model):
    name = models.CharField(max_length=200)
    price = models.DecimalField(max_digits=8, decimal_places=2)

    def __str__(self):
        return self.name


class Cart(models.Model):
    user = models.OneToOneField(User, on_delete=models.CASCADE)
    products = models.ManyToManyField(Product)

    def __str__(self):
        return f"{self.user.username} Cart"


"""
ManyToMany Meaning:
-------------------
Cart (Many) -------- (Many) Products

Example:
- One cart can contain many products
- One product can be in many carts
"""


# -----------------------------------
# 6. MANY-TO-MANY WITH EXTRA DATA (THROUGH MODEL)
# -----------------------------------
class Student(models.Model):
    name = models.CharField(max_length=100)

    def __str__(self):
        return self.name


class Course(models.Model):
    title = models.CharField(max_length=200)
    students = models.ManyToManyField(
        Student,
        through="Enrollment"
    )

    def __str__(self):
        return self.title


class Enrollment(models.Model):
    student = models.ForeignKey(Student, on_delete=models.CASCADE)
    course = models.ForeignKey(Course, on_delete=models.CASCADE)
    enrolled_date = models.DateField()
    grade = models.CharField(max_length=2)

    def __str__(self):
        return f"{self.student.name} -> {self.course.title}"


"""
ManyToMany Through Meaning:
---------------------------
Used when relationship itself has data.

Example:
- Student joins Course
- Need extra info:
    - enrollment date
    - grade
"""
