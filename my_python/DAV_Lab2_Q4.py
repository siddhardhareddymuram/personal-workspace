sentence=input("Enter the Sentence: ")
freq={}
n=len(sentence)
for i in range(n):
    if sentence[i] in freq:
        freq[sentence[i]]+=1
    else:
        freq[sentence[i]]=1

print(freq)