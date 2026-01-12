sentence=input("Enter a sentence:")
words=sentence.split()
word_count=[]
for i in words:
    word_count.append((i, len(i)))
print(word_count)