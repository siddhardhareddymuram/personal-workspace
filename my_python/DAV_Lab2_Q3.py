world_cup_winners = {
    1975: "West Indies",
    1979: "West Indies",
    1983: "India",
    1987: "Australia",
    1992: "Pakistan",
    1996: "Sri Lanka",
    1999: "Australia",
    2003: "Australia",
    2007: "Australia",
    2011: "India",
    2015: "Australia",
    2019: "England",
    2023: "Australia"
}

count = {}

for year, country in world_cup_winners.items():
    if country in count:
        count[country] += 1
    else:
        count[country] = 1

max_wins = max(count.values())

for team, wins in count.items():
    if wins == max_wins:
        print("Most Well Performed Team is:", team)

unq=[]
for team in count.keys():
    unq.append(team)

print("Unique List of all the Won Teams is:",unq)