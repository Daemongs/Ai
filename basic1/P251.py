temp = {"월":15.5, "화":17.0, "수":16.2, "목":12.9, "금":11.0, "토":10.5, "일":13.3}

#6-1
print("-"*40)
for key in temp : 
    print("%3s "%key , end=" ")
print()
print("-"*40)
for key in temp : 
    print("%.1f "%temp[key] , end=" ")
print()
print("-"*40)

#6-2
min = 999
minKey = "월"
sum = 0
for key in temp :
    if min > temp[key] :
        min = temp[key]
        minKey = key
print("요일 : %s, 최저 기온: %.1f" %(minKey, min))
avg = sum/len(temp)
print("일주일간 기온 평균 %.1f"%avg)

