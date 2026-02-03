from django.shortcuts import render 
from django.http import HttpResponse

# Create your views here.
def todo(req):
    return HttpResponse("This is response")

