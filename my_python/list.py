# This program demonstrates the use of lists in Python
marks=[90,85,78,92,88]
print("Marks obtained in each subject:",marks)
print("Number of subjects:",len(marks))

for score in marks:
    print("Score:",score)

marks.append(95)
marks.insert(0,99)