marks={"English":90,"Maths":85,"Science":78,"History":92,"Geography":88}
print(marks["Maths"])  # This will raise a KeyError since 'chemistry' is not a key in the dictionary
marks["physics"]=95  # Adding a new key-value pair
print(marks)    