teams = {
    1999: "Australia",
    2003: "Australia",
    2007: "Australia",
    2011: "India",
    2015: "Australia",
    2019: "England",
    2023: "Australia"
}

freq = []
unq = []
best = ""

for year, team in teams.items():
    if team not in unq:
        unq.append(team)
        freq.append(1)
    else:
        index = unq.index(team)
        freq[index] += 1

max_freq = freq[0]
best = unq[0]

for i in range(len(freq)):
    if freq[i] > max_freq:
        max_freq = freq[i]
        best = unq[i]

print(best)