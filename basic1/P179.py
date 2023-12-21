#178 4-6
#10! = 1 X 2 X 3 X ... 10
for i in range (10):
    print (i, end=" ")
print( "-"*10)
for i in range (1,11) :
    print (i, end= " ")
print("-"*30)
for i in range ( 11, 0, -1) :
    print(i, end=" ")
print("-" *30)
for i in "I love you!" :
    print(i, end=" ") 
sum = 0
j = 1
while True : 
    if sum >= 5000 :
        break
    else :
        j += 1
        sum +=j
print( j, sum)

fac = 1
for i in range(1, 11):
    fac = fac*i
print(fac)

count = 0
for i in range (1, 1001) :
    if count == 10 :
        print()
        count = 0
    if i % 3 != 0 :
        print(i, end=" ")
        count += 1

#While 문
i = 1
count = 0
while i <= 1000 :
    if count == 10 :
        print()
        count =0
    if i % 3 != 0 :
        print (i, end = " ")
        count += 1
    i += 1

    