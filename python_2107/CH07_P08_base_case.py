
def reverse(name):
    if name=="":
        return
    print(" "*len(name),name[-1])
    reverse(name[:-1])

reverse("harsh")