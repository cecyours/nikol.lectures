import clear
import numpy as np

# a = np.arange(12).reshape(6,2)
# print(a)
# # print(a[2][0][1])
# print("----------------")

# for i in a:#row
#     for j in i: # column
#         print("{:2}".format(j),end=" ")
#     print()


a = np.arange(18).reshape(3,3,2)
print(a)
print("------------- indexing.")
print(a[1])
print("------------- slicing.")
print(a[0][1:])


