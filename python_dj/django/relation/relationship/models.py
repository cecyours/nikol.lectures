from django.db import models

# Create your models here.
class User(models.Model):
    fullName = models.CharField(max_length=250)
    email = models.EmailField()
    username = models.CharField(max_length=20)

    def __str__(self):
        return self.username


class Profile(models.Model):
    user = models.OneToOneField(User , on_delete=models.CASCADE)
    bio =  models.TextField(blank=True) 

    def __str__(self):
        return f"{self.user.username} Profile"

        
class Product(models.Model):
    name = models.CharField(max_length=200)
    price = models.DecimalField(max_digits=10 ,decimal_places=2)

class Order(models.Model):
    # one to many
    user  =  models.ForeignKey(User , on_delete=models.CASCADE , related_name="orders")
    products = models.ManyToManyField(Product , related_name="orders")
    total_price = models.DecimalField(max_digits=10 , decimal_places=2)
    status  = models.CharField(max_length=20 , default='pending')
    created_at = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return f"Order #{self.id} by {self.user.username}"




