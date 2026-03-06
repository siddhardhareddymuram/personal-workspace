def checking_prime():
    a=int(input("Enter the Integer: "))
    
    if a<1:
        return False
    for i in range(2,a//2+1):
        if a%i==0:
            return False
        
        
    return True
    
result=checking_prime()
print("Result is:",result)
