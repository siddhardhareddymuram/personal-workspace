set1=set()
set2=set()
a=int(input("Enter Number of elements in SET_1: "))
print("Enter the elements of SET_1: ")
for i in range(a):
    x=int(input())
    set1.add(x)
b=int(input("Enter Number of elements in SET_2: "))
print("Enter the elements of SET_2: ")
for i in range(b):
    x=int(input())
    set1.add(x)

print("Union:", set1.union(set2))
print("Intersection:", set1.intersection(set2))
print("Difference (Set1 - Set2):", set1.difference(set2))
print("Difference (Set2 - Set1):", set2.difference(set1))