tuple=(1,2,3,4,5)
print(tuple)
try:
    tuple[0]=10
except TypeError as e:
    print("Error:", e)