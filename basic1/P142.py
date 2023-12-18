#for문, while 문

for x in range(1,11,2) :
    print(x)

for yx in range(5,101,5) :
    print(yx)

for z in range (100, 4, -5):
    print (z)
print ("------------------")

for zy in range(3, 100, 2):
    print (zy)

# start = int(input("시작수?"))
# stop = int(input("마지막수?"))
# increae = int(input("증가수?"))
# for x in range (start, stop,increae)
#     print (x)

#1~100까지합
#변수 1,2,3,4,...100
#합계변수 1, 1+2, 1+2+3 ... sum+sum+x
    
sum = 0
for x in range(1, 101, 1):
    sum = sum + x
print (sum)

#합계의 합계변수
#sumsum = 1, 1+(1+2)

for x in range (1, 11) : #1~10
    print(x)
for x in range (1, 10, 2) : #1 3 5 7 9
    print(x)
for x in range (20, 0, -2) : #30 18 16 ...2
    print(x)


#2024년도 1월 1일부터 2024년 1월 31일까지 출력하기
# 2024 / 1 / 1
# 2024 / 1 / 1
year = 2024
month = 1
day = 1
for day in range (1, 32) :
    print (year, month, day, sep="/")
    print ()    

sum = 0
for x in range(1,101) :
    sum +=x
    if sum >= 3000:
        break
print (sum, x)

# 't' 몇개인가요?
count = 0
for x in "this is python" :
    print(x)
    if x == " " :
        count += +1

for x in "this is pathon" :
    print(x)
    if x =="s" or x =="i" :
        count += 1
print(f" 's'이거나 'i'의 갯수는{count}개 입니다")

for i in range(1,10) : #1~9
    for j in range (2,10) : #2~9
         # print (f"{j} x {i} = {j*i}", end = ", " )
        print( "%2dX%2d=%2d"%( j, i, j*i), end = " ")
    print()

for i in range(2,10) :
    for j in range (1,10) :
        print("%2dX%2d=%2d "%(i, j, i*j), end=" ")
    print()