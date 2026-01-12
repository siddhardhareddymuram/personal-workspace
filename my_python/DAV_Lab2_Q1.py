list=[]

n=int(input("Enter the number of elements you want in the list:"))
for i in range(0,n):
    element=int(input("Enter element:"))
    list.append(element)
max=0
min=0
sum=0
avg=0
for i in list:
    if i>max:
        max=i
    elif i<min:
        min=i
    sum=sum+i
avg=sum/n
print("Maximum element in the list is:",max)
print("Minimum element in the list is:",min)        
print("Sum of all elements in the list is:",sum)
print("Average of all elements in the list is:",avg)